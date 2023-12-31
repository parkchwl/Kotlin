import java.util.Scanner

fun main() {
    var a: Int
    var b: Int
    var c: Int
    var d: Int
    var e: Int
    var f: Int

    val sc = Scanner(System.`in`)
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    d = sc.nextInt()
    e = sc.nextInt()
    f = sc.nextInt()

    for (i in -999..999) {
        for (j in -999..999) {
            if (a * i + b * j == c && d * i + e * j == f) {
                println("$i $j")
                return
            }
        }
    }
}
