# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/group-anagrams/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = hashMapOf<String, MutableList<String>>() // сортиров значение: List <слова>

        for (word in strs) {
            val sortWord = word.toCharArray().sorted().joinToString("")
            
            if (!map.containsKey(sortWord)) {
                map[sortWord] = mutableListOf<String>()
            }
            map[sortWord]?.add(word)
        }
        
        return map.values.toList()
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


