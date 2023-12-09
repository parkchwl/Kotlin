import kotlin.math.sqrt

fun main() {
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    var sum = 0
    var minPrime = -1
    var found = false

    for (i in m..n) {
        if (IsPrime(i)) {
            sum += i

            if (!found || i < minPrime) {
                minPrime = i
                found = true
            }
        }
    }

    if (!found) {
        println(-1)
    } else {
        println(sum)
        println(minPrime)
    }
}

fun IsPrime(num: Int): Boolean {
    if (num < 2) {
        return false
    }
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
