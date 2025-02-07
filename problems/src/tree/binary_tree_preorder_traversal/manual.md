# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/RHz-IsJZ6B7y36

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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        traverce(root, result)
        return result

    }


    private fun traverce(root: TreeNode?, result: MutableList<Int>){
        if(root == null) return

        result.add(root.`val`)
        traverce(root.left, result)
        traverce(root.right, result)

    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(h)

# 4. Ваши объяснения
действие - лево - право


