/**
 * Created by doctorq on 2017/6/7.
 */


suspend fun doSomeThing() {
}
fun doOther() {
}
fun <T> asyncTwo(block: suspend () -> T) {}
fun main(args: Array<String>) {
    doOther()
    asyncTwo { doSomeThing() }
    asyncTwo { doOther() }
}
