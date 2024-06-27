fun main() {
    val n = readLine()!!.toInt()
    val dp = IntArray(n + 1) { it }  

    for (i in 1..n) {
        var j = 1
        while (j * j <= i) {
            dp[i] = minOf(dp[i], dp[i - j * j] + 1)
            j++
        }
    }

    println(dp[n])
}