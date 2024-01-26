import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, M) = StringTokenizer(br.readLine()).let { it.nextToken().toInt() to it.nextToken().toInt() }
    
    val hash = HashSet<String>(N)
    val list = ArrayList<String>(N.coerceAtLeast(M))

    repeat(N) {
        hash.add(br.readLine())
    }

    var count = 0

    repeat(M) {
        val input = br.readLine()
        if (input in hash) {
            list.add(input)
            count++
        }
    }

    list.sort()

    with(StringBuilder()) {
        append(count).append("\n")
        list.forEach {
            append(it).append("\n")
        }
        println(this)
    }
}
