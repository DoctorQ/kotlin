/**
 * Created by doctorq on 2017/6/2.
 */


class Prop {
    var counter = 0
        set(value) {
            if (value >= 0) field = value
            println(field)
        }
}

fun main(args:Array<String>){
    val pro = Prop()
    pro.counter
}
