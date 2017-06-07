/**
 * Created by doctorq on 2017/6/7.
 */


fun main(args: Array<String>) {
    var sum = 0;
    val list = listOf(1, 2, 3, 4)
    list.map {
        it * 2
        sum++
    }
    println(sum)
}