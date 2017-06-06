/**
 * Created by doctorq on 2017/6/1.
 */

class Doctorq {
    fun foo() {
        println("member")
    }

}

fun Doctorq.foo(i: Int) {
    println("extension")
}


open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    override abstract fun f()
    fun b() {}
}