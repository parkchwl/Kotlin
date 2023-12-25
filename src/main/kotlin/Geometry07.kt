import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()

        if (a == b && b == c) {
            if (a == 0)
                break
            println("Equilateral")
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            println("Invalid")
        } else if (a != b && b != c && c != a) {
            println("Scalene")
        } else {
            println("Isosceles")
        }
    }
    sc.close()
}
