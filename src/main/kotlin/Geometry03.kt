import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val x = IntArray(3)
    val y = IntArray(3)
    var dx: Int
    var dy: Int

    for (i in 0 until 3) {
        x[i] = sc.nextInt()
        y[i] = sc.nextInt()
    }

    dx = if (x[1] == x[2]) {
        x[0]
    } else {
        if (x[0] == x[1]) x[2] else x[1]
    }

    dy = if (y[1] == y[2]) {
        y[0]
    } else {
        if (y[0] == y[1]) y[2] else y[1]
    }

    println("$dx $dy")
}
