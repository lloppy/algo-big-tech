# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/add-strings/description/


Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun addStrings(num1: String, num2: String): String {
        val size1 = num1.length
        val size2 = num2.length
        if (size2 > size1) return addStrings(num2, num1)

        val ans = StringBuilder()
        var carry = 0

        for (i in 0 until size1) {
            val digit1 = num1[size1 - 1 - i] - '0'
            val digit2 = if (i < size2) num2[size2 - 1 - i] - '0' else 0

            val rawSum = digit1 + digit2 + carry
            carry = rawSum / 10 
            ans.append(rawSum % 10)
        }

        if (carry > 0) ans.append(carry)
        return ans.reverse().toString()
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


