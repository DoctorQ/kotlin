/**
 * Created by doctorq on 2017/6/6.
 */
import kotlin.properties.Delegates

class QUser {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val user = QUser()
    user.name = "first"
    println("==========")
    user.name = "second"
}