fun main() {
    val N = readLine()!!.toInt()
    var rooms = 1
    var result = 1

    if (N == 1) {
        print(result)
    } else {
        while (rooms < N) {
            rooms += result * 6
            result++
        }
        print(result)
    }
}