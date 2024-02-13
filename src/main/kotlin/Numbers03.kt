import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var c1: Int
    var c2: Int
    var p1: Int
    var p2: Int

    c1 = scan.nextInt()
    p1 = scan.nextInt()
    c2 = scan.nextInt()
    p2 = scan.nextInt()

    c1 = c1 * p2 + c2 * p1
    p1 = p1 * p2
    val gcd = getGcd(c1, p1)

    println("${c1 / gcd} ${p1 / gcd}")
}

fun getGcd(a: Int, b: Int): Int {
    return if (a % b == 0) {
        b
    } else {
        getGcd(b, a % b)
    }
}
