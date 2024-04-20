import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var lefts = ArrayList<Int>()

    for (i in 0 until 10) {
        val num = nextInt()
        if (!((num % 42) in lefts)) {
            lefts.add(num % 42)
        }
    }

    print(lefts.count())
}