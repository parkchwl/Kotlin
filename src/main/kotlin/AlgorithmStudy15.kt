import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()
    val m = br.readLine()
    val dp = Array(m.length + 1) { Array(n.length + 1) { 0 } }

    for (i in 1..m.length) {
        for (j in 1..n.length) {
            if (m[i - 1] == n[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    println(dp[m.length][n.length])
}
