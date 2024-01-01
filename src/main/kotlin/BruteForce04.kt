import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()
    val M = scanner.nextInt()

    val arr = Array(N) { BooleanArray(M) }

    // 배열 입력
    for (i in 0 until N) {
        val str = scanner.next()

        for (j in 0 until M) {
            arr[i][j] = str[j] == 'W'
        }
    }

    val N_row = N - 7
    val M_col = M - 7

    var min = 64

    for (i in 0 until N_row) {
        for (j in 0 until M_col) {
            val count = find(arr, i, j)
            min = min.coerceAtMost(count)
        }
    }
    println(min)
}

fun find(arr: Array<BooleanArray>, x: Int, y: Int): Int {
    val end_x = x + 8
    val end_y = y + 8
    var count = 0

    var TF = arr[x][y]

    for (i in x until end_x) {
        for (j in y until end_y) {
            if (arr[i][j] != TF) {
                count++
            }
            TF = !TF
        }
        TF = !TF
    }

    return count.coerceAtMost(64 - count)
}
