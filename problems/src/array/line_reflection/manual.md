# ДНЕВНИК РЕШЕНИЙ

https://www.lintcode.com/problem/908/description

> https://ya.cc/t/CoVOdszL7ZYyWK


Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:
https://boosty.to/pleakley/posts/2abf2af6-c53b-4cd0-8dc1-8b1c2c2519fb

# 1. Решение

## Мое решение
Время выполнения: O(n)
Память: O(n)

```kotlin
class Solution {

    fun isReflected(points: Array<IntArray>): Boolean {
        if(points.isEmpty()) return true
        
        // 1. создаем хешмапу, где ключ - это поинты, а значение - кол-во повторений
        // 2. найдем минимальную и максимальную точки
        
        var minX = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        
        val pointSet = HashSet<String>()
        
        for(point in points){
            val x = point[0]
            val y = point[1]
            val key = "$x,$y"

            minX = minOf(minX, x)
            maxX = maxOf(maxX, x)
            
            pointSet.add(key)
        }
        
        // найдем координату х, по которой мы будет отражать точки: не делим на 2, тк в mirrorPoint мы умножаем это значение на 2
        val doubleX = (minX + maxX)
     
        // теперь проходимся по всей хешмапе. мы должны на каждую точку найти отраженную.   
        for(point in points){
            val x = point[0]
            val y = point[1]
            
            // Если точка на линии отражения, пропускаем проверку
            if (2 * x == doubleX) continue
                        
            val mirrorX = doubleX - x
            val mirrorKey = "$mirrorX,$y"
          
            // if (mirrorKey !in pointSet) return false
            if(!pointSet.contains(mirrorKey)) return false
        }
        
        return true
    }
}
```

## Решение с учетом повторяющихся точек:

```kotlin
class Solution {
    fun isReflected(points: Array<IntArray>): Boolean {
        if (points.isEmpty()) return true
        
        var minX = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        val pointMap = HashMap<String, Int>()
        
        for (point in points) {
            val x = point[0]
            val y = point[1]
            val key = "$x,$y"
            
            minX = minOf(minX, x)
            maxX = maxOf(maxX, x)
            pointMap[key] = pointMap.getOrDefault(key, 0) + 1
        }
        
        val doubledReflectionLine = minX + maxX
        
        for ((key, count) in pointMap) {
            val parts = key.split(",")
            val x = parts[0].toInt()
            val y = parts[1].toInt()
            
            if (2 * x == doubledReflectionLine) continue
            
            val mirroredX = doubledReflectionLine - x
            val mirroredKey = "$mirroredX,$y"
            
            val mirroredCount = pointMap[mirroredKey] ?: 0
            if (mirroredCount != count) {
                return false
            }
        }
        
        return true
    }
}
```


<br>

## Решение, до которого сложно додуматься
```kotlin
class Solution {
    /**
     * @param points: n points on a 2D plane
     * @return: if there is such a line parallel to y-axis that reflect the given points
     */
    fun isReflected(points: Array<IntArray>): Boolean {
        // Write your code here
       if (points.isEmpty()) return true
        
        val pointList = points.map { Point(it[0], it[1]) }
        val pointSet = pointList.toHashSet()
        
        val minX = pointList.minOf { it.x }
        val maxX = pointList.maxOf { it.x }
        val sum = minX + maxX
        
        for (point in pointList) {
            val reflectedPoint = Point(sum - point.x, point.y)
            if (reflectedPoint !in pointSet) {
                return false
            }
        }
        return true
    }
}

data class Point(val x: Int, val y: Int)
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти


# 4. Ваши объяснения


