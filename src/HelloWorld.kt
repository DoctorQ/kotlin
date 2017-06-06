/**
 * Created by doctorq on 2017/5/24.
 */

package com.doctorq

import java.util.*

fun main(args: Array<String>) {
    println("HelloWorld")
    println(sum1(1, 2))
    printSum(2,3)
    printSum1(4,3)
    var c:Int
    c = 1
    //语句注释
    println(c)
}
fun maxOf(a: Int, b: Int): Int? {
    if (a > b) {
        return a
    } else {
        return null
    }
}

fun maxOf1(a: Int, b: Int) = if (a > b) a else b



/*语句块注释
fun sum(a: Int, b: Int): Int {
    return a + b
}
*/

fun sum1(a: Int, b: Int) = a + b

fun printSum1(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}