/**
 * Created by doctorq on 2017/5/27.
 */
fun main(args: Array<String>) {
//    val list = listOf("doctorq", "dev", "test")
//
//    for (item in list) {
//        println(item)
//    }
//
//
//    for (index in list.indices) {
//        println("$index : ${list[index]}")
//    }
//    var index = 0
//    while (index < list.size) {
//        println("item at $index is ${list[index]}")
//        index++
//    }

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }
    println(describe(1))
    println(describe(10L))
}

