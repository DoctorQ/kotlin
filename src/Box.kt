/**
 * Created by doctorq on 2017/6/6.
 */
class Box<T>(t: T) {
    var value = t
}


fun main(args: Array<String>) {

    val box = Box<Int>(1)
    val box1 = Box(1)

    println(box.toString())
}