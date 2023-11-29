import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    while (true) {
        val first = sc.nextInt()
        val second = sc.nextInt()

        if (first == 0 && second == 0) break

        when {
            second % first == 0 -> println("factor")
            first % second == 0 -> println("multiple")
            else -> println("neither")
        }
    }
}