import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    var N = scanner.nextInt()

    if (N == 1) {
        return
    }

    for (i in 2..N) {
        while (N % i == 0) {
            println(i)
            N /= i
        }
    }
}
