/**
 * Created by doctorq on 2017/5/27.
 */

fun main(args: Array<String>) {
    val customer = Customer("doctorq", "542113578@qq.com")
//    println(customer.toString())
//    println(customer.equals("dd"))
//    println(customer.email)
//    println(customer.name)
//    println(customer.copy())


//    println(maxOf1(b=1))
//    println(maxOf1(3,2))

    val list = listOf(1, 2, 3, 4, -1)
    val listbyFilter = list.filter {it >  0 }

    println(listbyFilter)
    val test = "helloworld"
    typeCheck(customer)
}

fun maxOf1(a: Int = 0, b: Int) = if (a > b) a else b

data class Customer(val name: String, val email: String)
fun typeCheck(customer:Customer){
    when (customer) {
        is Customer -> println("this is Foo")
        else   -> println("other")
    }
}