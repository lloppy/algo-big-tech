# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/longest-substring-without-repeating-characters/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length == 0) return 0
        
        val unicChar = mutableSetOf<Char>(s[0])
        var max = 0
        var l = 0 
        var r = 0 

        while (l < s.length) {
            while (r < s.length - 1 && s[r + 1] !in unicChar) {
                unicChar.add(s[r + 1])
                r += 1 
            }

            max = maxOf(max, r - l + 1)
            unicChar.remove(s[l])
            l += 1
            
            // и вот так если r пошел быстрее l
            if (r < l && l < s.length) {
                r = l
                unicChar.add(s[r])
            }
        }
        return max

    }
}
```
Основная проблема - когда вы двигаете left, вы не обновляете r соответствующим образом. После l += 1 ваш r может остаться позади, что приводит к неправильным расчетам.




# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


