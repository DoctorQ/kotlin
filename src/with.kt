/**
 * Created by doctorq on 2017/5/27.
 */
class Turtle {
    fun penDown(){
        println("penDown")
    }
    fun penUp(){
        println("penUp")
    }
    fun turn(degrees: Double){
        println("degrees $degrees")
    }
    fun forward(pixels: Double){
        println("forward $pixels")
    }
}

fun main(args: Array<String>) {
    val myTurtle = Turtle()
    with(myTurtle) {
        //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

}