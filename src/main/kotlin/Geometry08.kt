import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val cm = IntArray(3)
    var max = 0
    var index = 0
    var answer = 0
    var other = 0

    for (i in 0 until 3) {
        cm[i] = scanner.nextInt()
        if (max < cm[i]) {
            max = cm[i]
            index = i
        }
    }

    when (index) {
        0 -> {
            other = cm[1] + cm[2]
            answer = getTotal(max, other)
        }
        1 -> {
            other = cm[0] + cm[2]
            answer = getTotal(max, other)
        }
        else -> {
            other = cm[0] + cm[1]
            answer = getTotal(max, other)
        }
    }

    println(answer)
}

fun getTotal(max: Int, other: Int): Int {
    return if (max < other) {
        max + other
    } else {
        other * 2 - 1
    }
}
