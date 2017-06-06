/**
 * Created by doctorq on 2017/6/6.
 */

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println("==========")
    println(lazyValue)
}
