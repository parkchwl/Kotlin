import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var x = sc.nextInt()
    var count = 0
    var i = 1
    var bunmo = 0
    var num = 0

    while (count < x) {
        count += i
        i++
    }

    if ((i - 1) % 2 == 0) {
        bunmo = 1 + (count - x)
        num = (i - 1) - (count - x)
    } else {
        bunmo = (i - 1) - (count - x)
        num = 1 + (count - x)
    }

    println("$num/$bunmo")
}
