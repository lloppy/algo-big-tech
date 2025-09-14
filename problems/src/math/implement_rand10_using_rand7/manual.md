# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/implement-rand10-using-rand7/submissions/1770254228/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
/**
 * The rand7() API is already defined in the parent class SolBase.
 * fun rand7(): Int {}
 * @return a random integer in the range 1 to 7
 */
class Solution : SolBase() {
    fun rand10(): Int {
        while (true) {
            val num = (rand7() - 1) * 7 + rand7() // 1-49
            if (num <= 40) {
                return num % 10 + 1
            }
        }
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


