import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val numbers = IntArray(N)

    repeat(N) {
        numbers[it] = br.readLine().toInt()
    }

    numbers.sort()

    numbers.forEach {
        println(it)
    }
}
