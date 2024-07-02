fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n + 1) { IntArray(10) }
    for (i in 0 until 10) {
        dp[1][i] = 1
    }

    for (k in 2..n) {

        for (i in 0..9) {
            for (j in 0..i) {
                dp[k][i] = (dp[k][i] + dp[k - 1][j]) % 10_007
            }
        }
    }
    println(dp[n].toList().reduce { acc, num -> (acc + num) % 10_007 })
}

// BOJ 11057_오르막 수