import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

class AlgorithmStudy02 {
    companion object {
        lateinit var graph: Array<IntArray>
        lateinit var dist: IntArray
        var n: Int = 0
        var m: Int = 0
        var start: Int = 0
        var end: Int = 0
    }

    fun dfs(index: Int) {
        if (index == end) return

        for (i in 1..n) {
            if (graph[index][i] == 1 && dist[i] == 0) {
                dist[i] = dist[index] + 1
                dfs(i)
            }
        }
    }

    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))

        n = br.readLine().toInt()
        graph = Array(n + 1) { IntArray(n + 1) }
        dist = IntArray(n + 1)

        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        m = br.readLine().toInt()

        repeat(m) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            graph[x][y] = 1
            graph[y][x] = 1
        }

        dfs(start)

        println(if (dist[end] == 0) -1 else dist[end])
    }
}

fun main() {
    AlgorithmStudy02().main()
}
