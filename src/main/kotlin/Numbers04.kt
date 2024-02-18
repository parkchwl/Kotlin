fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toLong() }
    var ans = 0

    if (B > A && B % 2 == 0L) {
        var tempB = B
        while (tempB > A) {
            tempB = when {
                tempB % 2 == 0L -> tempB / 2
                tempB % 10 == 1L -> tempB / 10
                else -> {
                    ans = -1
                    break
                }
            }
            ans++
        }
    } else {
        ans = -1
    }

    println(ans)
}
