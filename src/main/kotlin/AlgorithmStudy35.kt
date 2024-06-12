import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()
    
    if (n == 0) {
        println("0")
        return
    }

    val result = StringBuilder()

    while (n != 0) {
        var remainder = n % -2
        n /= -2

        if (remainder < 0) {
            remainder += 2
            n += 1
        }

        result.append(remainder)
    }

    println(result.reverse().toString())
}
