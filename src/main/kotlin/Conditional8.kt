import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`)))
{
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for(i in 1 .. readLine().toInt()){
        val num = readLine().split(" ")
        writer.write("Case #$i: ${num[0].toInt() + num[1].toInt()}\n")
    }
    writer.flush()
    writer.close()
    close()
}