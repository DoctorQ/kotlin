/**
 * Created by doctorq on 2017/6/6.
 */
//class Outer {
//
//    private val bar: Int = 1
//
//    class Nested {
//        fun foo() = 2
//    }
//}


fun main(args: Array<String>) {
//    val demo = Outer.Nested().foo()
    val demo = Outer().Inner().foo() //==1
    println(demo)
}


class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() //==1