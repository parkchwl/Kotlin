import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val N = sc.nextInt()

    var result = 0

    for (i in 0 until N) {
        var number = i
        var sum = 0

        while (number != 0) {
            sum += number % 10
            number /= 10
        }
        if (sum + i == N) {
            result = i
            break
        }
    }

    println(result)
}
