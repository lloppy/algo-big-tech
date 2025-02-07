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

