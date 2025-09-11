# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

Спроектируйте стек с поддержкой операций push, pop, top, peekMax и popMax.

push(x) - Добавить элемент x в стек.

pop() - Удалить элемент с вершины стека и вернуть его.

top() - Получить элемент на вершине стека.

peekMax() - Найти максимальный элемент в стеке.

popMax() - Найти максимальный элемент в стеке, удалить его и вернуть. Если есть несколько максимальных элементов, удалить только самый верхний.

# 1. Решение гпт
Два стека - основной стек и стек для отслеживания максимумов


```kotlin
class MaxStack {
    private val mainList = mutableListOf<Int>()
    private val maxList = mutableListOf<Int>()

    fun push(x: Int) {
        mainList.add(x)
        if (maxList.isEmpty() || x >= maxList.last()) {
            maxList.add(x)
        } else {
            maxList.add(maxList.last())
        }
    }

    fun pop(): Int {
        maxList.removeLast()
        return mainList.removeLast()
    }

    fun top(): Int {
        return mainList.last()
    }

    fun peekMax(): Int {
        return maxList.last()
    }

    fun popMax(): Int {
        val max = peekMax()
        val tempList = mutableListOf<Int>()

        // Находим и удаляем максимальный элемент
        while (top() != max) {
            tempList.add(pop())
        }
        val result = pop() // удаляем максимальный элемент

        // Возвращаем элементы обратно
        for (i in tempList.size - 1 downTo 0) {
            push(tempList[i])
        }

        return result
    }

    fun isEmpty(): Boolean {
        return mainList.isEmpty()
    }
}
```

Обычный pop() удаляет верхний элемент (последний добавленный).

popMax() удаляет максимальный элемент (где бы он ни был в стеке).

**📊 Пример отличия:**
```kotlin
Стек: [5, 1, 5, 3]  (вершина справа)

Обычный pop(): удаляет 3 → [5, 1, 5]
popMax(): удаляет 5 (максимум) → [5, 1, 3]
```


```text
Исходно: [5, 1, 5, 3]
          ↑
       максимум

1. Удаляем до максимума: [5, 1, 5] + temp [3]
                          ↑
                       максимум

2. Удаляем максимум: [5, 1] + result = 5

3. Возвращаем обратно: [5, 1, 3]
                        ↑
                 максимум (все еще 5)
```

Временно удаляем элементы до максимума

Удаляем сам максимум

Возвращаем элементы обратно

# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения

что нужно реализовать:

```kotlin
class MaxStack {
    public MaxStack() {}
    public void push(int x) {}
    public int pop() {}
    public int top() {}
    public int peekMax() {}
    public int popMax() {}
}
```
