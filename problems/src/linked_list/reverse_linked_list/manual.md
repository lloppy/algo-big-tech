# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
    /**
    * Example:
    * var li = ListNode(5)
    * var v = li.`val`
    * Definition for singly-linked list.
    * class ListNode(var `val`: Int) {
    *     var next: ListNode? = null
    * }
    */
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
        
            var curr = head 
            var prev: ListNode? = null
           
            while(curr != null) {
                var nextTemp = curr
                curr = curr.next
                nextTemp.next = prev
                prev = nextTemp
            }
            
            return prev
        }
    }
```


# 2. Оценка по времени
проходка по всем нодам - O(n)

# 3. Оценка по памяти
создаем новый масссив prev со всеми развернутыми нодами - O(1)

# 4. Ваши объяснения

делаем дамми ноду для хранения последних в списке значений. далле:
1. ставим указатель темп на текущую ноду1
2. двигаем текущую ноду1 на следущую2, делаем шаг
3. разбиваем связь: темп.next1 стрелочкаУказательНоды1 удаляется и заменяется на НодуПредыдущую0 (= стрелочкуНодуПредыдущую0)
4. двигаемся с ноды0 на первую ноду1 (с которой начинали)

получается косичка из ходов.

