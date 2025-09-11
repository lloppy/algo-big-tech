# ДНЕВНИК ОШИБОК
Все решения, которые были зафейлены

Смысл данного дневника зафиксировать вообще все свои провальные отправки, а потом по возможности к ним вернуться и написать внизу каждой отправки, что было не так.

Когда вы зафиксируете что было не так, то с большой вероятностью перестанете допускать такую ошибку в дальнейшем, а значит и шанс на отправку без ошибок вырастет

1. проверять, а серидинный элемент - не нуливой ли индекс? если он нулевой, значит у нас всего один элемент в массиве. и мы можем слуйчайно выйти за его границы при проверке nextNum

```kotlin
        return if(num == 0) true else num < nextNum
```


3. Я подумала и предложила такое решение 
```kotlin
class Solution {
    fun isGood(num: Int, nextNum: Int): Boolean {
        return num < nextNum
    }

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var r = arr.size

        while (r - l > 1){
            var middle = (l + r) / 2

            if(middle == 0) l = middle  
            if(isGood(arr[middle], arr[middle+1])) l = middle else r = middle
        }    
        return if(r == arr.size) -1 else l + 1
    }
}
```
 

вот первоначальное
```kotlin
class Solution {
    fun isGood(num: Int, nextNum: Int): Boolean {
        return num < nextNum
    }

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var r = arr.size

        while (r - l > 1){
            var middle = (l + r) / 2

            if(middle == 0) l = middle  
            if(isGood(arr[middle], arr[middle+1])) l = middle else r = middle
        }    
        return if(r == arr.size) -1 else l + 1
    }
}
```