import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val num1 = sc.nextLong()
    val num2 = sc.nextLong()

    val gcd = getGCD(num1, num2)

    println((num1 * num2) / gcd)
}

tailrec fun getGCD(a: Long, b: Long): Long {
    return if (b == 0L) a else getGCD(b, a % b)
}
