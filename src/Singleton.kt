/**
 * Created by doctorq on 2017/5/27.
 */
object Singleton {
    val name = "doctorq"
}

fun String.toDoctorq(): String {
    return "Doctorq! " + toString()
}

fun main(args: Array<String>) {
    //println(Singleton.name)
    println("hello world".toDoctorq())
}
