fun main() {
    val T = readLine()!!.toInt()
    val op = arrayListOf<Int>()
    val prime = BooleanArray(10001) { it % 2 == 1 }
    prime[1] = false

    // 에라토스테네스의 체 알고리즘을 사용하여 소수를 찾음
    for (i in 3..100 step 2) {
        if (prime[i]) {
            op += i
            for (j in i * i..10000 step i * 2) {
                prime[j] = false
            }
        }
    }

    repeat(T) {
        val n = readLine()!!.toInt()
        var answer = 2

        // 소수 쌍을 찾는 루프를 개선함
        for (p in op) {
            if (p > n / 2) break
            if (prime[n - p]) answer = p
        }

        println("$answer ${n - answer}")
    }
}
