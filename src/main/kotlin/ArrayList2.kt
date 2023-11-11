import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val X = nextInt()
    var arr = ArrayList<Int>()

    for (i in 1 .. N){
        var num = nextInt()
        if(num < X){
            print("$num ")
        }
    }
}