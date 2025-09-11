package a_tasks_yandex

fun main(){
    val givenStr = "Flatten Nested List Iterator\n" +
            "Implement Queue using Stacks\n" +
            "Evaluate Reverse Polish Notation\n" +
            "Simplify Path\n" +
            "Max Stack\n" +
            "Maximal Rectangle"
    val prettyStr = givenStr
        .lowercase()
        .replace(" ", "_")

    println(prettyStr)
}
