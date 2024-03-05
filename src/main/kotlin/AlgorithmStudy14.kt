import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val dp = IntArray(11) { 0 }.apply {
        this[1] = 1
        this[2] = 2
        this[3] = 4
    }

    repeat(sc.nextInt()) {
        println(dp[sc.nextInt()])
    }
}
