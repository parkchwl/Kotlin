import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    val dp = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray() }

    for (i in 1 until n) {
        dp[i][0] += min(dp[i - 1][1], dp[i - 1][2])
        dp[i][1] += min(dp[i - 1][0], dp[i - 1][2])
        dp[i][2] += min(dp[i - 1][0], dp[i - 1][1])
    }

    println(minOf(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2]))
}
//BOJ 1149_ RGB거리