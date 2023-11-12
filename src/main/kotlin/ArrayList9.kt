import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val M = nextInt()
    var bucket = IntArray(N) { it + 1 }

    repeat(M) {
        var i = nextInt()
        var j = nextInt()

        while (i < j ) {
            val temp = bucket[i - 1]
            bucket[i - 1] = bucket[j - 1]
            bucket[j - 1] = temp
            i++
            j--
        }
    }

    bucket.forEach { print("${it} ") }
}