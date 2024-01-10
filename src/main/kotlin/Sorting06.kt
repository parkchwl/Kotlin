import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val counting = IntArray(10)

    var N = scanner.nextInt()

    while (N != 0) {
        counting[N % 10]++
        N /= 10
    }

    for (i in 9 downTo 0) {
        while (counting[i]-- > 0) {
            print(i)
        }
    }
}
