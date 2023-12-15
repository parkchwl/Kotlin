import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val x = sc.nextInt()
    val y = sc.nextInt()
    val w = sc.nextInt()
    val h = sc.nextInt()

    val xMin = minOf(x, w - x)
    val yMin = minOf(y, h - y)

    println(minOf(xMin, yMin))
}
