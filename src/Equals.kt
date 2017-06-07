/**
 * Created by doctorq on 2017/6/7.
 */


fun main(args: Array<String>) {
    val a: Int? = 1
    var b: Int? = 2
    a?.equals(b) ?: b === null
}