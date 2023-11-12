import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var left = ArrayList<Int>()

    for (i in 0 until 10) {
        val num = nextInt()
        if (!((num % 42) in left)) {
            left.add(num % 42)
        }
    }

    print(left.count())
}