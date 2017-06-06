/**
 * Created by doctorq on 2017/6/5.
 */
open class CC

class DD : CC()

fun CC.foo() = "c"

fun DD.foo() = "d"

fun printFoo(c: CC) {
    println(c.foo())
}

fun Any?.toString(): String {
    if (this == null) {
        println("this is null")
        return "null"
    }
    // 在空检查之后，`this` 被自动转为非空类型，因此 toString() 可以被解析到任何类的成员函数中
    return toString()
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun main(args: Array<String>) {
    val doctorq = listOf<Int>(2, 4, 4, 5)
    doctorq.lastIndex
}