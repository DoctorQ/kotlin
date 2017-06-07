/**
 * Created by doctorq on 2017/6/7.
 */


fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

fun check(y: Int?) {
    val x: String ? = y as? String
    println(x)
}

fun main(args: Array<String>) {
    val y: Int? = null
    check(y)
}