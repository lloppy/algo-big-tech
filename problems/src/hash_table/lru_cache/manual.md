# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/lru-cache/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class LRUCache(var capacity: Int) {
//   (1) - (2) - (3)
//  (1:1) (2:2) (3:3) // значение: ссылка на ноду у ЛЛ

    private class Node(val key: Int, var value: Int) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val hash = mutableMapOf<Int, Node>()  // ключ -> узел
    private val head = Node(0, 0) // dummy
    private val tail = Node(0, 0) // dummy
    private var size = 0

    init {
        head.next = tail
        tail.prev = head
    }

    private fun addToHead(node: Node) {
        node.prev = head
        node.next = head.next
        head.next?.prev = node
        head.next = node
    }

    private fun removeNode(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    private fun moveToHead(node: Node) {
        removeNode(node)
        addToHead(node)
    }

    private fun removeTail(): Node {
        val last = tail.prev!!
        removeNode(last)
        return last
    }

    fun get(key: Int): Int {
        val node = hash[key] ?: return -1 

        moveToHead(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
         if (hash.containsKey(key)) {
            // Обновляем значение и перемещаем в начало
            val node = hash[key]!!
            node.value = value
            moveToHead(node)
        } else {
            // Создаем новый узел
            val newNode = Node(key, value)
            hash[key] = newNode
            addToHead(newNode)
            size++
            
            // Если превысили capacity, удаляем самый старый
            if (size > capacity) {
                val last = removeTail()
                hash.remove(last.key)
                size--
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


