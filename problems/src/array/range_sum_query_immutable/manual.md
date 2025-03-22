# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class NumArray(nums: IntArray) {
    val px = mutableListOf<Int>(0)

    init {      
        nums.forEach {
            px.add(px.last() + it )
        }       
    }

    fun sumRange(left: Int, right: Int): Int {   
        return(px[right + 1] - px[left])   
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
```


# 2. Оценка по времени
0(n) на проходку массива px префф сумм

# 3. Оценка по памяти
0(n)

sumRange работает за O(1) and O(1)



# 4. Ваши объяснения
используем преффексный массив, и заранее вычисляем сумму на всех этапах

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
