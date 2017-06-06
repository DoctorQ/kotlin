/**
 * Created by doctorq on 2017/6/6.
 */
enum class Direction {
    NORTH, SOUTH, WEST
}

enum class Color(val rgb: Int) {
    RED(0xff0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(args: Array<String>) {
    val colors = Color.values()
    colors.forEach {
        println(it.name)
        println(it.ordinal)
    }
}

open class E(x: Int) {
    public open val y: Int = x
}


val ab = object : E(1){
    override val y = 14
}