import java.io.BufferedWriter
import java.io.OutputStream
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readln().toInt()) {
        for (j in 1..i) {
            writer.write("*")
        }
        writer.write("\n")
    }
    writer.flush()
    writer.close()
}