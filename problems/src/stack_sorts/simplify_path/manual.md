# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/simplify-path/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {

      fun simplifyPath(path: String): String {
        val stack = mutableListOf<String>()
        val items = path.split("/").filter { it.isNotEmpty() }

        for (item in items) {
            when (item) {
                "." -> continue
                ".." -> if (stack.isNotEmpty()) stack.removeLast()
                else -> stack.add(item)
            }
        }
        return "/" + stack.joinToString("/")
        
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


