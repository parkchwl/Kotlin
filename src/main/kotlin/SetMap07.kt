import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val a = HashSet<Int>()
    val b = HashSet<Int>()
    var result = 0

    repeat(n) {
        a.add(scanner.nextInt())
    }
    repeat(m) {
        b.add(scanner.nextInt())
    }

    for (i in a) {
        if (!b.contains(i)) {
            result++
        }
    }

    for (i in b) {
        if (!a.contains(i)) {
            result++
        }
    }

    println(result)
}
