import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val num = next()
    var result = 0

    for(i in 0 until N){
        result += (num[i]-'0')
    }
    print("$result")
}