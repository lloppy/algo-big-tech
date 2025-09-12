# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/insert-delete-getrandom-o1/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class RandomizedSet() {
    private val hash = mutableMapOf<Int, Int>()  // значение :  индекс в list
    private val list = mutableListOf<Int>()     // хранит значения

    fun insert(`val`: Int): Boolean {
        if (hash.containsKey(`val`) ) return false
        else {
            list.add(`val`)
            hash[`val`] = list.size - 1
            return true
        }
    }

    fun remove(`val`: Int): Boolean {
        if (!hash.containsKey(`val`) ) return false
        else {
            val removedIndex = hash[`val`]!!
            val lastElement = list.last()

            list[removedIndex] = lastElement
            hash[lastElement] = removedIndex

            list.removeLast()
            hash.remove(`val`)
            return true
        }
    }

    fun getRandom(): Int {
        val randomIndex = Random.Default.nextInt(list.size)
        return list[randomIndex]
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


