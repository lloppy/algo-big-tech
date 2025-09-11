# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/longest-palindromic-substring/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun longestPalindrome(s: String): String {
        if (s.length <= 1) return s
        
        var l = 0
        var r = 0
        
        for (i in s.indices) {
            val lenOdd = fromCenter(s, i, i)
            val lenEven = fromCenter(s, i, i+1)
            val currLen = maxOf(lenOdd, lenEven)

            if (currLen > r-l) {
                l = i - (currLen - 1) / 2  //adbab babad
                r = i + currLen / 2
            } 
        }

        return s.substring(l, r+1)
    
    }

    fun fromCenter(s: String, left: Int, right: Int): Int {
        var l = left
        var r = right
      
        while(l >=0 && r < s.length && s[r] == s[l]){
            l-=1
            r+=1
        }

        return r - l - 1
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


