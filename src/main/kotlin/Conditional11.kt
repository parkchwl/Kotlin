import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val repeat = readln().toInt()

    for (i in 1..repeat) {
        for (j in repeat downTo 1) {
            if (i >= j) {
                writer.write("*")
            } else {
                writer.write(" ")
            }
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
}