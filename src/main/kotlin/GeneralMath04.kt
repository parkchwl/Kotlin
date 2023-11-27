import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    var result = 2

    for (i in 0 until N) {
        result += (result - 1)
    }

    print(result * result)
}