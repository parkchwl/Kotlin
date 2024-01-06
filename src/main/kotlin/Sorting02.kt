import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(5)
    var sum = 0

    for (i in 0 until 5) {
        val num = sc.nextInt()
        arr[i] += num
        sum += num
    }

    println(sum / 5)

    arr.sort()

    println(arr[2])

    sc.close()
}
