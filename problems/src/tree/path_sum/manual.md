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

## Новое задание без решения

### Условие задачи

Дан массив целых чисел nums и целое число k. Нужно найти максимальную сумму подмассива длины k.

### Пример

Вход: nums = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Выход: 39

Вход: nums = [-1, -2, -3, -4], k = 2
Выход: -3

### Ограничения

* 1 <= k <= nums.length <= 10^5
* -10^4 <= nums[i] <= 10^4
