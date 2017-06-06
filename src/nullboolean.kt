/**
 * Created by doctorq on 2017/5/27.
 */


fun main(args: Array<String>) {
    val a: Boolean? = null
    val b: Boolean? = false
    val c: Boolean? = true
    checkBoolean(a)
    checkBoolean(b)
    checkBoolean(c)

}

fun checkBoolean(b: Boolean?) {
    if (b == true) {
        println("$b")
    } else {
        println("`b` is false or null")
    }
}
