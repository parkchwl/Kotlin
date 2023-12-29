import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()
    val M = scanner.nextInt()

    val arr = IntArray(N)

    for (i in 0 until N) {
        arr[i] = scanner.nextInt()
    }

    val result = search(arr, N, M)
    println(result)
}

fun search(arr: IntArray, N: Int, M: Int): Int {
    var result = 0

    for (i in 0 until N - 2) {
        for (j in i + 1 until N - 1) {
            for (k in j + 1 until N) {
                val temp = arr[i] + arr[j] + arr[k]

                if (M == temp) {
                    return temp
                }

                if (result < temp && temp < M) {
                    result = temp
                }
            }
        }
    }

    return result
}
