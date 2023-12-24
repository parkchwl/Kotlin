import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    when {
        a + b + c != 180 -> println("Error")
        a == 60 && b == 60 && c == 60 -> println("Equilateral")
        a == b || b == c || c == a -> println("Isosceles")
        else -> println("Scalene")
    }
}
