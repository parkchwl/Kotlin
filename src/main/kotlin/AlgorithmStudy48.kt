import java.util.*
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine(), readLine())

    val arr = Array(N) {st.nextToken().toInt()}
    val dp = Array(N) {0}

    dp[0] = arr[0]
    var max = arr[0]


    for (i in 1 until N) {
        dp[i] = max(dp[i-1] + arr[i], arr[i])
        max = max(max, dp[i])
    }

    println(max)
}

// BOJ_1912 연속합