# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/perfect-squares/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun numSquares(n: Int): Int {
        val result = IntArray(n + 1) {Int.MAX_VALUE}
        result[0] = 0 // Для числа 0 нужно 0 квадратов

        // Для каждого числа i вычисляем MAX квадрат, который может в него поместиться
        for (i in 1..n) {

            val maxJ = sqrt(i.toDouble()).toInt() 
            for (j in maxJ downTo 1) {
                // result[i - j * j] - минимальное количество квадратов для остатка 
                // плюс текущий квадрат
                result[i] = minOf(result[i], result[i - j * j] + 1)
            }
        }
        return result[n] // минимальное количество квадратов для числа n
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
## 🧩 Ключевая формула
```kotlin
result[i] = minOf(result[i], result[i - j * j] + 1)
```
- `result[i]` - текущее лучшее решение для числа `i`
- `result[i - j * j] + 1` - альтернативное решение:
    - `result[i - j * j]` - минимальное количество квадратов для остатка
    - `+ 1` - добавляем текущий квадрат `j*j`

## 📊 Пошаговый пример для n = 4

### Инициализация:
```
result = [0, MAX, MAX, MAX, MAX]
```

### i = 1:
- `maxJ = √1 = 1`
- j = 1: `result[1] = min(MAX, result[1-1] + 1) = min(MAX, 0+1) = 1`
```
result = [0, 1, MAX, MAX, MAX]
```

### i = 2:
- `maxJ = √2 ≈ 1` (j = 1)
- j = 1: `result[2] = min(MAX, result[2-1] + 1) = min(MAX, 1+1) = 2`
```
result = [0, 1, 2, MAX, MAX]
```

### i = 3:
- `maxJ = √3 ≈ 1` (j = 1)
- j = 1: `result[3] = min(MAX, result[3-1] + 1) = min(MAX, 2+1) = 3`
```
result = [0, 1, 2, 3, MAX]
```

### i = 4:
- `maxJ = √4 = 2` (j = 1, 2)

**j = 1:**
- `result[4] = min(MAX, result[4-1] + 1) = min(MAX, 3+1) = 4`

**j = 2:**
- `result[4] = min(4, result[4-4] + 1) = min(4, 0+1) = 1`
```
result = [0, 1, 2, 3, 1]
```

Возвращаем значение `result[n]` - минимальное количество квадратов для числа `n`

