import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var numbers = IntArray(30) { it + 1 }.toMutableList()

    for (num in 0 until 28) {
        val score = nextInt()
        if (score in numbers) {
            numbers.remove(score)
        }
    }

    print("${numbers[0]}\n${numbers[1]}")
}