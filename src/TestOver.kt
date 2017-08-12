class TestOver() : AccountingSync() {
    override fun increase() {
        println(i)
    }



}

fun main(args: Array<String>) {
    val test = TestOver()
    val thread = Thread(test)
    thread.start()
}





