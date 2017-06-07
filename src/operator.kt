/**
 * Created by doctorq on 2017/6/7.
 */

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

fun main(args: Array<String>) {
    val b: String? = null
    val l = b!!.length
    val point = Point(10, 20)
    println(-point)  // prints "(-10, -20)"
    val counter = Counter(1)
    println(counter + 3)
}


data class Counter(var dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}
