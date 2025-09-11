# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 
> https://ttzztt.gitbooks.io/lc/content/zigzag-iterator.html

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:
Проблема: Нужно создать итератор, который проходит по элементам нескольких коллекций в зигзагообразном порядке (поочередно из каждой коллекции).

Итератор должен возвращать элементы по очереди из каждого переданного списка, пока все элементы не будут пройдены.


Для двух списков:

v1 = [1, 2, 3]

v2 = [4, 5, 6, 7]

Порядок элементов: 1, 4, 2, 5, 3, 6, 7


# 1. Решение

```kotlin
class ZigzagIterator(v1: IntArray, v2: IntArray) {
    /**
     * Пример использования:
     * val obj = ZigzagIterator(intArrayOf(1,2,3), intArrayOf(4,5,6,7))
     * while (obj.hasNext()) {
     *     println(obj.next())
     * }
     */

    private val queue: Queue<Int> = LinkedList()
    
    init {
        var i = 0
        var j = 0
        
        while(i < v1.size || j < v2.size) {
            if (i < v1.size) {
                queue.add(v1[i])
                i++
            }
            if (j < v2.size) {
                queue.add(v2[j])
                j++
            }
        }
    }
    
    fun next(): Int {
        return queue.poll()
        
    }
    
    fun hasNext(): Boolean {
        return queue.isNotEmpty()
    }
}
```


# 2. Оценка по времени

Инициализация: O(n + m), где n и m - длины массивов

next(): O(1) - получение из очереди

hasNext(): O(1) - проверка очереди

# 3. Оценка по памяти

O(n + m) - храним все элементы в очереди



# 4. Ваши объяснения

```kotlin
// начальный код 

class ZigzagIterator(v1: IntArray, v2: IntArray) {

    fun next(): Int {
        // реализуйте этот метод
    }

    fun hasNext(): Boolean {
        // реализуйте этот метод
    }

    /**
     * Пример использования:
     * val obj = ZigzagIterator(intArrayOf(1,2,3), intArrayOf(4,5,6,7))
     * while (obj.hasNext()) {
     *     println(obj.next())
     * }
     */
}
```
