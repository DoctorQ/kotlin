/**
 * Created by doctorq on 2017/5/27.
 */


fun main(args: Array<String>) {

    println(p)
    println(p)
}
val p: String by lazy {
    println("init")
    val o = "helloworld"
    o
}
