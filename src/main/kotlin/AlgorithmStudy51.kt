fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for(i in 4..10) {
        dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
    }

    val sb = StringBuilder()
    val testCase = br.readLine().toInt()

    repeat(testCase) {
        sb.append("${dp[br.readLine().toInt()]}\n")
    }

    bw.write("$sb")
    bw.flush()
    bw.close()
    br.close()
}