# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun compress(chars: CharArray): Int {
        var writeIndex = 0 // Куда записываем результат
        var readIndex = 0  // Откуда читаем исходный массив

        while (readIndex < chars.size) {
            val currentChar = chars[readIndex]
            var count = 0

            // Считаем количество подряд идущих currentChar
            while (readIndex < chars.size && chars[readIndex] == currentChar) {
                readIndex++
                count++
            }

            // Записываем символ
            chars[writeIndex++] = currentChar

            // Записываем цифры числа (если count > 1)
            if (count > 1) {
                for (digit in count.toString()) {
                    chars[writeIndex++] = digit
                }
            }
        }

        return writeIndex
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


