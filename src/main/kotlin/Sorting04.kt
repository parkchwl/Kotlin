import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sb = StringBuilder()

    val N = scanner.nextInt()

    val list = ArrayList<Int>()

    repeat(N) {
        list.add(scanner.nextInt())
    }

    list.sort()

    for (value in list) {
        sb.append(value).append('\n')
    }
    println(sb)
}
