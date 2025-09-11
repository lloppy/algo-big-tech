# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/flatten-nested-list-iterator/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * class NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     constructor()
 *
 *     // Constructor initializes a single integer.
 *     constructor(value: Int)
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     fun isInteger(): Boolean
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     fun getInteger(): Int?
 *
 *     // Set this NestedInteger to hold a single integer.
 *     fun setInteger(value: Int): Unit
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     fun add(ni: NestedInteger): Unit
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     fun getList(): List<NestedInteger>?
 * }
 */

class NestedIterator(nestedList: List<NestedInteger>) {
    val stack = mutableListOf<Int>()
    var currIdx = 0

    init {
        flatten(nestedList)
    }

    fun flatten(nestedList: List<NestedInteger>) {
        for (item in nestedList) { 
            if(item.isInteger()) stack.add(item.getInteger()!!)
            else flatten(item.getList()!!)
        }
    }


    fun next(): Int {
        return stack[currIdx++]
    }
    
    fun hasNext(): Boolean {
        return currIdx < stack.size
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


