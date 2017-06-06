/**
 * Created by doctorq on 2017/6/6.
 * 伴随对象
 */


class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

fun main(args: Array<String>) {
    val instance = MyClass.create()
}