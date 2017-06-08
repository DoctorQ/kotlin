/**
 * Created by doctorq on 2017/6/8.
 */

import java.util.*
fun demo(source: List<Int>) {
    val list = ArrayList<Int>()
    for (item in source )
        list.add(item)
    for (i in 0..source.size - 1)
        list[i] = source[i]
}


annotation class fancy




@fancy class Foo {
    @fancy fun baz(@fancy foo: Int): Int {
        return  1
    }
}

fun main(args: Array<String>) {
    val foo = Foo()
    println(foo.baz(2))
}