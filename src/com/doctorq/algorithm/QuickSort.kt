/**
 * Created by doctorq on 2017/6/2.
 * 快排
 */
package com.doctorq.algorithm
object QuickSort {

    fun sort(array: MutableList<Int>): MutableList<Int> {

        if (array.size == 0 || array.size == 1) return array
        val flag = array[0]
        //删除基准元素
        array.removeAt(0)
        val leftArray = mutableListOf<Int>()
        val rightArray = mutableListOf<Int>()
        //站队，小于等于基准值的放到左边篮子里，大于基准值放到右边篮子里
        array.forEach {
            if (it <= flag) {
                leftArray.add(it)
            } else {
                rightArray.add(it)
            }
        }
        //递归排序左右两侧数据
        val sortedLeftArray = sort(leftArray)
        val sortedRightArray = sort(rightArray)

        //排序完成后,组装
        val sortedArray = mutableListOf<Int>()
        sortedLeftArray.forEach {
            sortedArray.add(it)
        }
        sortedArray.add(flag)
        sortedRightArray.forEach {
            sortedArray.add(it)
        }

        return sortedArray
    }
}


