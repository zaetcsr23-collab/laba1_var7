package com.example.laba1_var7

class Task {
    fun completeTask(numbers: List<Int>): String {
        val countMap = numbers.groupingBy { it }.eachCount()
        val sortedElements = countMap.entries.sortedBy { it.value }
        val result = StringBuilder()
        result.append("Количество уникальных элементов: ${countMap.size}\n\n")
        result.append("Элементы (по возрастанию количества):\n")

        sortedElements.forEach { (element, count) ->
            val ending = when (count) {
                1 -> "раз"
                in 2..4 -> "раза"
                else -> "раз"
            }
            result.append("$element встречается $count $ending\n")
        }

        return result.toString()
    }

    fun generateRandomList(): List<Int> {
        return List(15) { (-10..10).random() }
    }
}