import java.io.File

/**
 * Created by doctorq on 2017/5/27.
 */
fun main(args:Array<String>){
    val files = File("Test").listFiles()
    println(files?.size ?: "doctorq!It is empty")

    val file = File("/Users/doctorq/Documents/Developer/git-project/learningkotlin1").listFiles()
    println(file?.size)

}