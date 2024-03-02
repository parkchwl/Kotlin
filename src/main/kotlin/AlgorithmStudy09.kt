import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()
    val S = sc.nextInt()
    val M = sc.nextInt()

    val volumes = IntArray(N) { sc.nextInt() }

    val dp = BooleanArray(M + 1)
    dp[S] = true

    for (i in 0 until N) {
        val nextDP = BooleanArray(M + 1)

        for (j in 0..M) {
            if (dp[j]) {
                val plus = j + volumes[i]
                val minus = j - volumes[i]

                if (plus in 0..M) nextDP[plus] = true
                if (minus in 0..M) nextDP[minus] = true
            }
        }

        dp.indices.forEach { j -> dp[j] = nextDP[j] }
    }

    val answer = dp.indexOfLast { it }
    println(answer)
}
