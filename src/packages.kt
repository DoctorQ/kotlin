/**
 * Created by doctorq on 2017/5/31.
 */


package com.doctorq.packages

import foo
import com.doctorq.Bar as BBar

fun main(args: Array<String>) {
//    val b = BBar()
//    b.check()
//    println("Hello World!")
//

    val a = 1
    val b = 2
    var max = a
    if (a < b) max = b
    var max1: Int
    if (a > b) {
        max1 = a
    } else {
        max1 = b
    }

    val max3 = if (a > b) a else b


//    val max4 = if (a > b) {
//        print("Choose a")
//        a
//    } else {
//        print("Choose b")
//        b
//    }

    val x = 2
//    val fd = doctorq@ when (x) {
//        1, 3 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> { // Note the block
//            print("x is neither 1 nor 2")
//        }
//    }


//    val array = arrayOf(2, 34, 0, 435, 32)

//    for(item in array){
//        println(item)
//    }

//    doctorq@ for (index in array.indices) {
//        println(index)
//    }

//    for ((index, value) in array.withIndex()) {
//        println("the element at $index is $value")
//    }
//
    doctorq@ for (i in 1..100) {
        doctorq2@ for (j in 1..100) {
            if (i > j) break@doctorq2

            if (i == 50) break@doctorq
        }
    }

    val array = arrayOf(2, 34, 0, 435, 32)
    foo(array)

}

fun foo(array: Array<Int>){

    array.forEach lit@{
        if (it == 0) return@lit
        print(it)
    }
}