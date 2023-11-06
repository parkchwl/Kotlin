import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val A = nextInt()
    val B = nextInt()

    if(A>B) print(">")
    else if(A==B) print("==")
    else print("<")
}