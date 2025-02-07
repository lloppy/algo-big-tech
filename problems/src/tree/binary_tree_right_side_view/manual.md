# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/5kT1vWk76B8amW

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        
        traverse(root, result, 0)
        return result
    }
    
    private fun traverse(root: TreeNode?, result: MutableList<Int>, level: Int ){
        if (root == null) return
        if (result.size == level) result.add(0)
        
        result[level] = root.`val`
        traverse(root.left, result, level+1)
        traverse(root.right, result, level+1)
    
    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(h)

# 4. Ваши объяснения
перезаписываем значения на уровнях

