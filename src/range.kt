/**
 * Created by doctorq on 2017/5/27.
 */
fun main(args:Array<String>){

    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    for (x in 1..10 step 2) {
        print("$x\n")
    }

    for (x in 9 downTo 0 step 3) {
        print("$x\n")
    }

}