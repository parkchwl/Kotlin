import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()

    val arr = Array(N) { IntArray(2) }

    for (i in 0 until N) {
        arr[i][0] = scanner.nextInt()
        arr[i][1] = scanner.nextInt()
    }

    arr.sortWith(compareBy({ it[0] }, { it[1] }))

    for (i in 0 until N) {
        println("${arr[i][0]} ${arr[i][1]}")
    }
}
