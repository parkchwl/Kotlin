import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()

    when {
        N == 4 || N == 7 -> println(-1)
        N % 5 == 0 -> println(N / 5)
        N % 5 == 1 || N % 5 == 3 -> println((N / 5) + 1)
        N % 5 == 2 || N % 5 == 4 -> println((N / 5) + 2)
    }
}
