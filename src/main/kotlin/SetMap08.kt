import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val set = HashSet<String>()

    for (i in str.indices) {
        for (j in i + 1..str.length) {
            set.add(str.substring(i, j))
        }
    }

    println(set.size)
}
