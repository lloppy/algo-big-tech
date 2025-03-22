# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/vrwdnUl46B8Jrz

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
  fun postorderTraversal(root: TreeNode?): List<Int> {
        var result = mutableListOf<Int>()
        
        traverse(root, result)
        return result
    }
    
    private fun traverse(root: TreeNode?, result: MutableList<Int>){
        if(root == null) return
        
        traverse(root.left, result)
        traverse(root.right, result)
        result.add(root.`val`)
    
    }
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(h) 

# 4. Ваши объяснения
влево - вправо - действие

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
