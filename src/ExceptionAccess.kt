/**
 * Created by doctorq on 2017/5/27.
 */
fun test() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }

    println(result)
}

fun count():Int{
    return 12
}
fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    println(result)
}
fun main(args:Array<String>){
//    foo(1)
//    foo(2)
//    foo(3)

    val list = arrayOfMinusOnes(3)

    for(i in list){
        println(i)
    }

}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}