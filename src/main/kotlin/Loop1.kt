import java.util.Scanner

fun main(){
    val num = readLine()!!.toInt()  // readln().toInt()를 사용하는 것과 같다.

    for( i in 1..9){
        println("$num * $i = ${num * i}")
    }
}