# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1770417011/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .map { it.reversed() }
            .joinToString(" ")
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения

```kotlin
class Solution {
    fun reverseWords(s: String): String {
        val result = StringBuilder()
        val word = StringBuilder()
        
        for (char in s) {
            if (char == ' ') {
                result.append(word.reverse()).append(' ')
                word.clear()
            } else {
                word.append(char)
            }
        }
        result.append(word.reverse())
        
        return result.toString()
    }
}
```
