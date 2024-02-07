import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val case = sc.nextInt()
    val t = IntArray(case)
    val p = IntArray(case)
    for (i in 0 until case) {
        t[i] = sc.nextInt()
        p[i] = sc.nextInt()
    }

    val dp = IntArray(case + 1)

    for (i in 0 until case) {
        if (i + t[i] <= case) {
            dp[i + t[i]] = maxOf(dp[i + t[i]], dp[i] + p[i])
        }
        dp[i + 1] = maxOf(dp[i + 1], dp[i])
    }
    println(dp[case])
}
