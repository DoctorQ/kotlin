/**
 * Created by doctorq on 2017/6/6.
 */

data class User(val name: String, val age: Int) {

}


fun main(args: Array<String>) {
    val user = User("doctorq", 28)
    println(user.toString())
    val copyUser = user.copy(age = 27)
    println(copyUser.toString())

    val (name,age) = copyUser

    println("$name is $age")

    val pair = Pair(1,2)
    println(pair.toString())
    val triple = Triple(1,2,3)

    println(triple.toString())

}
