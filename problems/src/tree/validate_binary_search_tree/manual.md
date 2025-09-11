# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

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
    fun isValidBST(root: TreeNode?): Boolean {
        return checkValid(root, null, null)
    }

    fun checkValid(node:TreeNode?, min: Int?, max: Int?): Boolean{
        if(node == null) return true
        
        if (min != null && node.`val` <= min) return false
        if (max != null && node.`val` >= max) return false
        
        return checkValid(node.left, min, node.`val`) && checkValid(node.right, node.`val`, max)
    }
}
```



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
      private var prev: Int? = null

      fun isValidBST(root: TreeNode?): Boolean {
        return inorderCheck(root)
    }

    fun inorderCheck(node:TreeNode?): Boolean{
        if(node == null) return true
        
        if(!inorderCheck(node.left)) return false
        
        if (prev != null && node.`val` <= prev!!) return false
        prev = node.`val`
        
        return inorderCheck(node.right)
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


