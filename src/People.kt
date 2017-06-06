/**
 * Created by doctorq on 2017/6/5.
 */
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {


    override fun foo() {

    }

    override fun bar() {

    }
}
fun <T> MutableList<T>.swap(x: Int, y: Int) {
    val temp = this[x] // this 对应 list
    this[x] = this[y]
    this[y] = temp
}
fun main(args: Array<String>) {
    val list = mutableListOf<Int>(1,2,3,5)
    list.swap(1,3)

    list.forEach{
        println("${it} ")

    }

}

