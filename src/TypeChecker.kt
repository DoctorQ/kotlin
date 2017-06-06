/**
 * Created by doctorq on 2017/5/27.
 */

fun main(args: Array<String>) {
    println(getStringLength("doctorq"))
    println(getStringLength(1))

}


fun getStringLength(obj:Any):Int? {
    if(obj !is String){
        return null
    }

    return obj.length
}