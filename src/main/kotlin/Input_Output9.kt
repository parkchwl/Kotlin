import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val A = nextInt()
    val B = nextInt()
    val C = nextInt()

    println("${(A+B)%C}")
    println("${((A%C) + (B%C))%C}")
    println("${(A*B)%C}")
    println("${((A%C)*(B%C))%C}")
}