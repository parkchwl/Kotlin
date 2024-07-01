fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val dp = IntArray(N + 1)
    dp[0] = 1
    dp[1] = 3
    for (i in 2..N) {
        dp[i] = (dp[i - 1] * 2 + dp[i - 2]) % 9901
    }
    println(dp[N])
} // BOJ_1309 동물원