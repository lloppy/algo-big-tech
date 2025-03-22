# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/uTVua1-J6B8C4q

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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        
        traverce(root, result)
        return result
    }
    
    private fun traverce(root: TreeNode?, result: MutableList<Int> ){
        if (root == null) return
        
        traverce(root.left, result)
        result.add(root.`val`)
        traverce(root.right, result)

    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(h)

# 4. Ваши объяснения
лево - действие - право

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
