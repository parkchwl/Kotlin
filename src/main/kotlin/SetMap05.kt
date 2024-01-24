import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    val n = input.nextInt()
    val arr = IntArray(n) { input.nextInt() }
    
    arr.sort()

    val m = input.nextInt()
    
    val result = StringBuilder()

    repeat(m) {
        val key = input.nextInt()
        result.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ')
    }
    
    println(result)
}

private fun lowerBound(arr: IntArray, key: Int): Int {
    var lo = 0
    var hi = arr.size

    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (key <= arr[mid]) {
            hi = mid
        } else {
            lo = mid + 1
        }
    }

    return lo
}

private fun upperBound(arr: IntArray, key: Int): Int {
    var lo = 0
    var hi = arr.size

    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (key < arr[mid]) {
            hi = mid
        } else {
            lo = mid + 1
        }
    }

    return lo
}
