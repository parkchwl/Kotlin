import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val map = HashMap<String, Int>()

    repeat(n) {
        map[br.readLine()] = 0
    }

    var count = 0
    repeat(m) {
        if (map.containsKey(br.readLine())) {
            count++
        }
    }

    print(count)
}
