# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class RecentCounter() {
    private val queue = ArrayDeque<Int>()
    
    fun ping(t: Int): Int {
        queue.add(t)

        while(queue.isNotEmpty() && queue.first() < t - 3000 ) {
            queue.removeFirst()
        }

        return queue.size
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


