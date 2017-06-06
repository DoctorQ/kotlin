/**
 * Created by doctorq on 2017/6/6.
 * 代理模式
 */

interface BaseOne {
    fun print()
}

class BaseImpl(val x: Int) : BaseOne {
    override fun print() {
        println("BaseImpl $x")
    }
}
class BaseImplTwo(val x: Int) : BaseOne {
    override fun print() {
        println("BaseImplTwo $x")
    }
}

class DerivedOne(b: BaseOne) : BaseOne by b

fun main(args: Array<String>) {
    val a = BaseImpl(10)
    val c = BaseImplTwo(10)
    DerivedOne(a).print()
    DerivedOne(c).print()
}

