fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val price = br.readLine().split(' ').map { it.toInt() }
    val dp = IntArray(num+1)

    for(i in 1 .. num) {
        dp[i] = price[i-1]
        for(j in 1 .. i) {
            dp[i] = minOf(dp[i], dp[i - j] + price[j-1])
        }
    }

    bw.write("${dp[num]}")
    bw.flush()
    bw.close()
    br.close()
}
// BOJ 16194_ 카드 구매하기 2