package com.doctorq.algorithm

/**
 * Created by doctorq on 2017/6/2.
 * 堆排序
 */

object HeapSort {
    /**
     * 创建最大堆结构,要求是任何非叶子节点都比它的左右两个节点都要大
     */
    fun createHeap(array: MutableList<Int>, i: Int) {
        if (array.size == 1) return

        //首先堆的重要特性是非叶子节点数少于size/2，所以我们只需要调整前size/2索引上的值
        val leftChildIndex = 2 * i + 1
        val rightChildIndex = 2 * i + 2
        var max = i
        if (i <= array.size / 2) {
            //如果左子节点比当前大，那么调换位置
            if (leftChildIndex < array.size && array[leftChildIndex] > array[i]) {
                max = leftChildIndex
            }
            //如果右子节点比当前大，那么调换位置
            if (rightChildIndex < array.size && array[rightChildIndex] > array[i]) {
                max = rightChildIndex
            }

            if (max != i) {
                //调换位置
                swap(array, i, max)
                createHeap(array, i)
            }
        }
    }

    private fun swap(array: MutableList<Int>, i: Int, max: Int) {
        val temp = array[i]
        array[i] = array[max]
        array[max] = temp
    }


    fun buildHeap(array: MutableList<Int>) {
        var i = array.size / 2
        while (i >= 0) {
            createHeap(array, i)
            i--
        }
    }
    /**
     * 堆排序
     */
    fun sort(array: MutableList<Int>) {
        var size = array.size
        while (size > 0) {
            buildHeap(array)
            print("${array[0]} ")
            //获取一次最大堆后删除后，重新生成新堆
            array.removeAt(0)
            size--
        }
    }
}