/**
 * Created by doctorq on 2017/6/6.
 */


class MyUser(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

fun main(args: Array<String>) {
    val user = MyUser(mapOf(
            "name" to "Doctorq",
            "sez"  to "F"
    ))

    println(user.name)
    println(user.age)
}
