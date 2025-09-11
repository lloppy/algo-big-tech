package yandex_contest_2025.d_pismo

import java.io.File
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.awt.Graphics2D
import java.util.Base64
import java.io.ByteArrayInputStream

fun main() {
    val filePath =     "C:\\Users\\ankud\\Downloads\\algo-big-tech\\problems\\src\\a_yandex_contest_2025\\d_pismo\\images.json"
    val map = mutableMapOf<Int, String>()

    try {
        val jsonString = File(filePath).readText()

        val itemsPart = jsonString.substringAfter("\"items\": [").substringBefore("]")
        val items = itemsPart.split("},")

        items.forEachIndexed { index, itemStr ->
            val cleanItemStr = itemStr.replace("{", "").replace("}", "").trim()
            val parts = cleanItemStr.split(",")

            val image = parts.find { it.contains("\"image\"") }?.substringAfter(":")?.trim()?.trim('"') ?: ""
            val position = parts.find { it.contains("\"position\"") }?.substringAfter(":")?.trim()?.toIntOrNull() ?: 0

            map[position] = image
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    val size = 15
    val answer = Array(size) { Array(size) { "" } }

    var currentStage = Stage.VERTICALNO_NIZ
    var iBound = Bound(0, size - 1)
    var jBound = Bound(0, size - 1)

    var i = 0
    var j = 0
    var currentPos = 1
    val totalElements = size * size

    while (currentPos <= totalElements) {
        answer[i][j] = map[currentPos] ?: ""
        currentPos++

        when (currentStage) {
            Stage.VERTICALNO_NIZ -> {
                if (i < iBound.end) {
                    i++
                } else {
                    jBound.start++
                    currentStage = Stage.HORIZONTAL_PRAVO
                    j++
                }
            }
            Stage.HORIZONTAL_PRAVO -> {
                if (j < jBound.end) {
                    j++
                } else {
                    iBound.end--
                    currentStage = Stage.VERTICALNO_VERH
                    i--
                }
            }
            Stage.VERTICALNO_VERH -> {
                if (i > iBound.start) {
                    i--
                } else {
                    jBound.end--
                    currentStage = Stage.HORIZONTAL_LEVO
                    j--
                }
            }
            Stage.HORIZONTAL_LEVO -> {
                if (j > jBound.start) {
                    j--
                } else {
                    iBound.start++
                    currentStage = Stage.VERTICALNO_NIZ
                    i++
                }
            }
        }
    }

    // Create the final image
    val finalImage = BufferedImage(size * 170, size * 78, BufferedImage.TYPE_INT_RGB)
    val g: Graphics2D = finalImage.createGraphics()

    for (i in 0 until size) {
        for (j in 0 until size) {
            val imageData = answer[i][j]
            if (imageData.isNotEmpty()) {
                try {
                    val decodedBytes = Base64.getDecoder().decode(imageData)
                    val cellImage = ImageIO.read(ByteArrayInputStream(decodedBytes))
                    g.drawImage(cellImage, j * 170, i * 78, null)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    // Save the final image
    ImageIO.write(finalImage, "png", File("screenshot.png"))
    g.dispose()

    println("Spiral arrangement completed. Check output.png for the result.")
}

enum class Stage {
    VERTICALNO_VERH,  // Moving up vertically
    VERTICALNO_NIZ,   // Moving down vertically
    HORIZONTAL_LEVO,  // Moving left horizontally
    HORIZONTAL_PRAVO  // Moving right horizontally
}

data class Bound(var start: Int, var end: Int)