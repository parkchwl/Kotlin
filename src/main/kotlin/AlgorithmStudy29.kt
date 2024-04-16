val bfr = System.`in`.bufferedReader()
fun getInt() = bfr.readLine().toInt()

fun main() = with(System.out.bufferedWriter()) {
    val n = getInt()
    var key = 5
    var answer = 0
    while (key <= n) {
        answer += n / key
        key *= 5
    }
    write("$answer")
    close()
}
