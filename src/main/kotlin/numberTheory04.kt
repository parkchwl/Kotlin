import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val tk = StringTokenizer(br.readLine())

    var count = 0

    for (i in 0 until N) {
        val num = tk.nextToken().toInt()
        if (isPrime(num)) {
            count++
        }
    }

    println(count)
}

private fun isPrime(num: Int): Boolean {
    if (num < 2) {
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}
