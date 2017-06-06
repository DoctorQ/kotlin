/**
 * Created by doctorq on 2017/5/31.
 */
package com.doctorq.numbers


fun main(args: Array<String>) {
    val oneMillion = 1_000_000

    println(oneMillion)
    val a: Int? = 10
    val b: Long? = 10
    val str: String = "Hello World"

    for (c in str) {
        println(c)
    }


}

fun check(c: Char) {
    if (c == '1') { // ERROR: incompatible types
        // ...
    }
}

