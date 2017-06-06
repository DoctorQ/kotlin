/**
 * Created by doctorq on 2017/6/6.
 */


infix fun Int.getMin(x: Int): Int {
    val result = if (this > x) x else this
    return result
}

fun double(x: Int): Int = x * 2

fun testDoctorq(name: String) {
    println("Outer Fun $name")
    fun testDoctorq(name: String, age: Int) {
        println("Inner Fun $name")
    }
    testDoctorq(name, 28)
}

fun main(args: Array<String>) {
//    val a: Int = 2
//    println(a getMin 3)
//    println(a.getMin(3))

//    testDoctorq("doctorq")
    println(findFixPoint())
}

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
