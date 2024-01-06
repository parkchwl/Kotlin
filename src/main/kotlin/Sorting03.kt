import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val arr = Array(n) { sc.nextInt() }

    Arrays.sort(arr)

    println(arr[n - k])
}
