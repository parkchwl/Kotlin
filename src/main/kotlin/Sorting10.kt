import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()
    val arr = Array(N) { Array(2) { "" } }

    for (i in 0 until N) {
        arr[i][0] = scanner.next()
        arr[i][1] = scanner.next()
    }

    arr.sortWith(compareBy { it[0].toInt() })

    for (i in 0 until N) {
        println("${arr[i][0]} ${arr[i][1]}")
    }
}
