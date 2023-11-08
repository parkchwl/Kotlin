import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val num = nextInt()

    for(i in 1 .. num){
        val a = nextInt()
        val b = nextInt()

        println("${a+b}")
    }


}