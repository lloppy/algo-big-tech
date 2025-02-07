# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/BXTMKvYo6B8yZ3

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
        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        
        return checkTrees(p, q)
    }
    
    private fun checkTrees(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null || q == null){
            return p == null && q == null
        }
        if (p.`val` != q.`val`) return false
        
        return checkTrees(p.left, q.left) && checkTrees(p.right, q.right)
    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(2n)

# 4. Ваши объяснения
а прошлой задачке шли зеркально, теперь же идем если вправо, то вправо вдвоем - влево, влево вместе

