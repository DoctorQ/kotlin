package com.doctorq.algorithm

/**
 * Created by doctorq on 2017/6/2.
 * 二分查找
 */
object BinarySearch {
    /**
     * 从集合中查找某个元素所在的下标
     */
    fun search(sortedArry: MutableList<Int>, searchNum: Int): Int {
        if (sortedArry.size == 0) {
            println("没有找到该元素:${searchNum}")
            return -1
        }

        val index = sortedArry.size / 2
        //如果中间位置的数等于查找的数，查找结束
        if (searchNum === sortedArry[index]) {
            println("发现该元素")
            return sortedArry[index]
        }
        var subSortedArray = mutableListOf<Int>()
        if (searchNum < sortedArry[index]) {
            //截取集合左边的数据
            subSortedArray = sortedArry.subList(0, index)
        } else {
            //截取集合右边的数据,+1刚好过滤掉基准值
            subSortedArray = sortedArry.subList(index + 1, sortedArry.size)
        }

        return search(subSortedArray, searchNum)
    }
}