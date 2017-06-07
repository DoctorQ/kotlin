package com.doctorq.algorithm

/**
 * Created by doctorq on 2017/6/7.
 */
class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if ((x != 0) && (x % 10 == 0)) return false
        var x1 = x
        var y: Int = 0
        while (x1 > y) {
            y = y * 10 + x1 % 10
            x1 = x1 / 10
        }
        return x1 == y || x1 == (y / 10)
    }
}


fun main(args: Array<String>) {
    val p = PalindromeNumber()
    println(p.isPalindrome(123))
    println(p.isPalindrome(12321))
}