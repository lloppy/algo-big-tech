# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение
```kotlin
class Solution {
    fun compress(chars: CharArray): Int {
        if (chars.size <= 1) return chars.size

        var writeIndex = 0
        var readIndex = 0

        while (readIndex < chars.size) {
            val curr = chars[readIndex]
            var count = 0

            while (readIndex < chars.size && chars[readIndex] == curr){
                readIndex += 1
                count += 1
            }

            chars[writeIndex] = curr
            writeIndex+=1

            if (count > 1) {
                val countStr = count.toString()
                for (char in countStr) {
                    chars[writeIndex] = char
                    writeIndex+=1
                }
            }
            count = 1
        }
        return writeIndex
    }
}
```

## Второе решение
```kotlin
class Solution {
    fun compress(chars: CharArray): Int {
        var writeIndex = 0 // Куда записываем результат
        var readIndex = 0  // Откуда читаем исходный массив

        while (readIndex < chars.size) {
            val currentChar = chars[readIndex]
            var count = 0

            // Считаем количество подряд идущих currentChar
            while (readIndex < chars.size && chars[readIndex] == currentChar) {
                readIndex++
                count++
            }

            // Записываем символ
            chars[writeIndex++] = currentChar

            // Записываем цифры числа (если count > 1)
            if (count > 1) {
                for (digit in count.toString()) {
                    chars[writeIndex++] = digit
                }
            }
        }

        return writeIndex
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
```kotlin
class Solution {
    fun compress(chars: CharArray): Int {
        if (chars.size <= 1) return chars.size

        var writeIndex = 0
        var count = 1

        for (i in 1 until chars.size) {
            val curr = chars[i]
            val prev = chars[i - 1]

            if (curr == prev) {
                count += 1 
            } else {
                chars[writeIndex] = prev
                writeIndex+=1

                if (count > 1) {
                    val countStr = count.toString()
                    for (char in countStr) {
                        chars[writeIndex] = char
                        writeIndex+=1
                    }
                }
                count = 1
            }
        }  

        chars[writeIndex] = chars.last()
        writeIndex += 1

        if (count > 1) {
            val countStr = count.toString()
            for (char in countStr) {
                chars[writeIndex] = char
                writeIndex+=1
            }
        }

        return writeIndex     
    }
}
```

