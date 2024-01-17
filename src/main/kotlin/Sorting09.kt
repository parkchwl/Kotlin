import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val data = List(n) { br.readLine() }

    data.distinct().sortedWith(compareBy<String> { it.length }.thenBy { it }).forEachIndexed { index, value ->
        if (index == 0 || value != data[index - 1]) {
            println(value)
        }
    }
}
