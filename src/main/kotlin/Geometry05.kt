import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val T = sc.nextInt()
    var minX = Int.MAX_VALUE
    var minY = Int.MAX_VALUE
    var maxX = -10000
    var maxY = -10000

    repeat(T) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        minX = minOf(minX, x)
        maxX = maxOf(maxX, x)
        minY = minOf(minY, y)
        maxY = maxOf(maxY, y)
    }

    val width = maxX - minX
    val height = maxY - minY
    println(width * height)
}
