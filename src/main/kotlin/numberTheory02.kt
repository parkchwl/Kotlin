import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val K = sc.nextInt()

    var count = 0
    for (i in 1..N) {
        if (N % i == 0) count++

        if (count == K) {
            println(i)
            break
        }
    }
    if (count < K) println(0)
}