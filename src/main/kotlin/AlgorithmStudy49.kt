fun main() {

    val DIV = 1000000000

    val (N, K) = readln().split(" ").map { it.toInt() }

    val dp = Array(K + 1) { IntArray(N + 1) { 1 } }

    for (i in 2..K) {
        for (j in 1..N)
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % DIV
    }

    println(dp[K][N])
}
//BOJ_2225 합분해