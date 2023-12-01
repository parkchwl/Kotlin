import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while (true) {
        val n = sc.nextInt()
        if (n == -1) break

        val arr = IntArray(n)
        var sum = 0
        var index = 0
        for (i in 1 until n) {
            if (n % i == 0) {
                arr[index++] = i
                sum += i
            }
        }

        if (sum != n) {
            println("$n is NOT perfect.")
            continue
        }

        print("$n = ")
        for (i in 0 until index) {
            print(if (i == index - 1) arr[i] else "${arr[i]} + ")
        }
        println()
    }

    sc.close()
}
