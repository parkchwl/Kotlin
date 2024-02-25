import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val K = scanner.nextInt()

    val list = LinkedList<Int>().apply {
        addAll(1..N)
    }

    val result = StringBuilder("<")
    var index = 0

    while (list.size > 1) {
        index = (index + K - 1) % list.size
        result.append(list.removeAt(index)).append(", ")
    }

    result.append(list.remove()).append(">")
    println(result)
}
