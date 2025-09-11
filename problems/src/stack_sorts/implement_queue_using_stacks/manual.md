# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/implement-queue-using-stacks/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class MyQueue() {

    val addStack = mutableListOf<Int>() //push
    val removeStack = mutableListOf<Int>() //pop/peek
    

    fun push(x: Int) {
        addStack.add(x)
    }

    fun pop(): Int {
        if (removeStack.isEmpty()) {
            swop()
        }
        return removeStack.removeLast()
    }

    fun peek(): Int {
        if (removeStack.isEmpty()) {
            swop()
        }
        return removeStack.last()
    }

    fun empty(): Boolean = addStack.isEmpty() && removeStack.isEmpty()
    

    fun swop() {
        while(addStack.size != 0) {  // [1, 2, 3, 4]
            removeStack.add(addStack.last())   // [4, 3, 2, 1]
            addStack.removeLast()              // [  ] 
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


