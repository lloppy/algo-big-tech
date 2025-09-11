# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/mlKV5htQ6B952H

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return checkCurrSum(root, 0, targetSum)   
    }
    
    private fun checkCurrSum(root: TreeNode?, currSum:Int, targetSum: Int): Boolean{
        if(root == null ) return false
        if(isLeaf(root)) {
            if(currSum + root.`val` == targetSum) return true
        }
        //или: if(isLeaf(node)) return node.`val` + currSum == target


        return checkCurrSum(root.left, currSum + root.`val`, targetSum) || checkCurrSum(root.right, currSum + root.`val`, targetSum)
    }
    
    private fun isLeaf(root: TreeNode?):Boolean{
        return root?.left == null && root?.right == null
    }
}

```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(n)

# 4. Ваши объяснения
префексные суммы. на текущей leaf ноде смотрим сумму текущей и предыдущей. если это лиф и сумма равна таргету - отлично возвращаем true


