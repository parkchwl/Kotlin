import java.util.*

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    for (i in 0 until n) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a * b / gcd(a, b))
    }
}
