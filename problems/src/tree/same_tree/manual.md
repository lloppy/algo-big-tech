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
