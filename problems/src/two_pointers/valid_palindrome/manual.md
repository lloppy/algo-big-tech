# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/valid-palindrome/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1

        while(r > l) {
            if(!s[l].isLetterOrDigit()) {
                l+=1
                continue
            }
            if(!s[r].isLetterOrDigit()) {
                r-=1
                continue
            }

            if(s[l].lowercaseChar() != s[r].lowercaseChar()) return false
            l += 1
            r -= 1
        }
        return true
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


