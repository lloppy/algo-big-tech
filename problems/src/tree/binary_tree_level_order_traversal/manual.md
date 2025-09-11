# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/binary-tree-level-order-traversal/

> https://ya.cc/t/K3aNkaLj6B8Pf5

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
     fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        
        traverse(root, result, 0)
        return result
    }
    
    private fun traverse(
        root: TreeNode?, 
        result: MutableList<MutableList<Int>>, 
        level: Int
    ){
        if(root == null) return
        
        if(level == result.size) result.add(mutableListOf<Int>())
        
        result.get(level).add(root.`val`)
        traverse(root.left, result, level + 1)
        traverse(root.right, result, level + 1)
    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(n)

# 4. Ваши объяснения
вот тут создаем новый массив для уровня         if(level == result.size) result.add(mutableListOf<Int>())
и туда кладет значение ноды текущего уровня


