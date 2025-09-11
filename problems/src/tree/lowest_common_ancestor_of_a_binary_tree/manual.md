# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return traverse(root, p, q)
    }

    fun traverse(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode?{
        if(root == null) return null
        if(root == p || root == q) return root

        // postorder
        val left = traverse(root.left, p, q)
        val right = traverse(root.right, p, q)

        return when {
            left != null && right != null -> root
            else -> left ?: right
        }
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


Разберем на **деталях примерах** как работает этот код! 🌟

## 📌 Пример 1: Простое дерево
```
    A
   / \
  B   C
```
**Ищем LCA для B и C**

### Шаги выполнения:
1. **Начинаем с A**:
    - A ≠ B, A ≠ C → продолжаем
    - Спрашиваем левого ребенка B

2. **Переходим к B**:
    - B == B ✅ → возвращаем B к A

3. **Переходим к C**:
    - C == C ✅ → возвращаем C к A

4. **Анализ в A**:
    - left = B, right = C
    - Оба не null → A является LCA!
    - **Возвращаем A**

## 📌 Пример 2: Глубокое дерево
```
    A
   / \
  B   C
 / \
D   E
```
**Ищем LCA для D и E**

### Шаги выполнения:
1. **A**: не D/E → спрашиваем B и C
2. **B**: не D/E → спрашиваем D и E
3. **D**: D == D ✅ → возвращаем D к B
4. **E**: E == E ✅ → возвращаем E к B
5. **B**: left = D, right = E → оба не null → B является LCA!
6. **A**: получает от B → возвращает B

## 📌 Пример 3: Один узел - предок другого
```
    A
   / \
  B   C
 /
D
```
**Ищем LCA для B и D**

### Шаги выполнения:
1. **A**: не B/D → спрашиваем B и C
2. **B**: B == B ✅ → возвращаем B к A (не идем к детям!)
3. **C**: не B/D → возвращает null к A
4. **A**: left = B, right = null → возвращает B
5. **B является LCA** (по определению: узел может быть собственным предком)

## 🎯 Ключевые правила алгоритма:

### 1. **Базовые случаи**:
```kotlin
if (root == null) return null          // Тупик
if (root == p || root == q) return root // Нашли цель!
```

### 2. **Рекурсивный опрос**:
```kotlin
val left = traverse(root.left, p, q)   // Что нашел левый?
val right = traverse(root.right, p, q) // Что нашел правый?
```

### 3. **Логика определения LCA**:
```kotlin
return when {
    // ОБА ребенка что-то нашли → я LCA!
    left != null && right != null -> root
    
    // Передаем наверх то, что нашли (или null)
    else -> left ?: right
}
```
