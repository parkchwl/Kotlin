import java.util.*

fun main() {
    val `in` = Scanner(System.`in`)
    val N = `in`.nextInt()

    var num = 666
    var count = 1

    while (count != N) {
        num++
        if (num.toString().contains("666")) {
            count++
        }
    }
    println(num)
}
