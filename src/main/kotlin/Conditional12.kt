import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var input: String?

    while (readLine().also { input = it } != null) {
        val num = input!!.split(" ")
        writer.write("${num[0].toInt() + num[1].toInt()}\n")
    }

    writer.flush()
    writer.close()
    close()
}