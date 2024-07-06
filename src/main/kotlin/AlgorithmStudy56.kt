import kotlin.math.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val dp = IntArray(num+1)
    val arr = IntArray(num){ br.readLine().toInt() }

    dp[1] = arr[0]
    if(num > 1) {
        dp[2] = arr[0] + arr[1]
    }
    for(i in 3 .. num) {
        dp[i] = max(dp[i - 2], dp[i - 3]+ arr[i - 2]) + arr[i - 1]
    }

    bw.write("${dp[num]}")
    bw.flush()
    bw.close()
    br.close()
}