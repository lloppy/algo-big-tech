# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/trapping-rain-water/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0
        
        var left = 0
        var right = height.size - 1
      
        var leftMax = 0
        var rightMax = 0
        var water = 0

         while (left <= right) {
            // Всегда работаем с той стороной, где максимум меньше
            if (leftMax <= rightMax) {
                // Обновляем максимум слева или добавляем воду
                leftMax = maxOf(leftMax, height[left])
                water += leftMax - height[left]
                left++
            } else {
                // Обновляем максимум справа или добавляем воду
                rightMax = maxOf(rightMax, height[right])
                water += rightMax - height[right]
                right--
            }
        }
        return water    
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


