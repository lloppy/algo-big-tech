package a_tasks_yandex

fun main(){
    val givenStr = "Line Reflection\n" +
            "Summary Ranges\n" +
            "String Compression\n" +
            "Move Zeroes\n" +
            "Maximize Distance to Closest Person\n" +
            "Consecutive Characters\n" +
            "Merge Sorted Array\n" +
            "Squares of a Sorted Array\n" +
            "Product of Array Except Self\n" +
            "Continuous Subarray Sum\n" +
            "Reverse Words in a String III"
    val prettyStr = givenStr
        .lowercase()
        .replace(" ", "_")

    println(prettyStr)
}
