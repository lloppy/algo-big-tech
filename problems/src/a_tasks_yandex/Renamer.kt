package a_tasks_yandex

fun main(){
    val givenStr = "Subarray Sum Equals K\n" +
            "Group Anagrams\n" +
            "Insert Delete GetRandom O(1)\n" +
            "LRU Cache\n" +
            "Two Sum\n" +
            "Jewels and Stones\n" +
            "Intersection of Two Arrays II\n" +
            "First Unique Character in a String"
    val prettyStr = givenStr
        .lowercase()
        .replace(" ", "_")

    println(prettyStr)
}
