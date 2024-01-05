import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()
    val arr = IntArray(N)

    for (i in 0 until N) {
        arr[i] = scanner.nextInt()
    }

    // Selection sort
    for (i in 0 until N - 1) {
        for (j in i + 1 until N) {
            if (arr[i] > arr[j]) {
                val temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
            }
        }
    }

    for (value in arr) {
        println(value)
    }
}
