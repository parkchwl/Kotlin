import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val T = reader.readLine().toInt()

    for (t in 0 until T) {
        val n = reader.readLine().toInt()
        val topRow = reader.readLine().split(" ").map { it.toInt() }.toIntArray()
        val bottomRow = reader.readLine().split(" ").map { it.toInt() }.toIntArray()

        if (n == 1) {
            println(maxOf(topRow[0], bottomRow[0]))
            continue
        }

        val dpTop = IntArray(n)
        val dpBottom = IntArray(n)

        // 초기화
        dpTop[0] = topRow[0]
        dpBottom[0] = bottomRow[0]
        dpTop[1] = bottomRow[0] + topRow[1]
        dpBottom[1] = topRow[0] + bottomRow[1]

        // DP 진행
        for (i in 2 until n) {
            dpTop[i] = maxOf(dpBottom[i-1], dpBottom[i-2]) + topRow[i]
            dpBottom[i] = maxOf(dpTop[i-1], dpTop[i-2]) + bottomRow[i]
        }

        // 결과 출력
        println(maxOf(dpTop[n-1], dpBottom[n-1]))
    }
}
