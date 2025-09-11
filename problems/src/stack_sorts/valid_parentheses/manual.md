# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/valid-parentheses/


Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun isValid(s: String): Boolean {
        val queue = mutableListOf<Char>()
        val charMap = mapOf<Char, Char>('(' to ')', '{' to '}', '[' to ']')

        if(s.length % 2 != 0) return false

        for(c in s){
            if (c in charMap.keys) queue.add(c)
            else {
                if (queue.isEmpty()) return false

                val lastOpen = queue.removeLast()  // сразу удаляем и получаем элемент
                if (charMap[lastOpen] != c) return false
            }
        }

        return queue.isEmpty()
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


