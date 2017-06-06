import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by doctorq on 2017/5/27.
 */


fun main(args: Array<String>) {
    val stream = Files.newInputStream(Paths.get("/Users/doctorq/Documents/Developer/git-project/learningkotlin1/learningkotlin1.iml"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}


