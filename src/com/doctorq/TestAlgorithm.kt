package com.doctorq

import com.doctorq.algorithm.HeapSort

/**
 * Created by doctorq on 2017/6/2.
 */

fun main(args: Array<String>) {
    val unSortArray = mutableListOf<Int>(4, 1, 2, 56, 24, 5, 6, 97, 8, 0, 3)
//    val sortedArray = QuickSort.sort(unSortArray)
//    sortedArray.forEach { print("${it} ") }
//    println()
//    BinarySearch.search(sortedArray, 97)
//    BinarySearch.search(sortedArray,)
    println("排序前:")
    unSortArray.forEach { print("${it} ") }
    println("排序后:")
    HeapSort.sort(unSortArray)
//    println()
}
