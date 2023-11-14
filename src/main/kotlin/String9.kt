import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val A = next().reversed()
    val B = next().reversed()

    if (A > B){
        print(A)
    } else {
        print(B)
    }
}