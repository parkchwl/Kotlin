import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    var res = 0L
    var a = 0L

    for (i in 1 until n - 1) {
        a += i
        res += a
    }

    println(res)
    println(3)
}
