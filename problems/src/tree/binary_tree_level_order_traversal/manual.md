# ДНЕВНИК РЕШЕНИЙ

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
