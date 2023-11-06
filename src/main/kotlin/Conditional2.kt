import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val score = nextInt()
    when(score){
        in 90 .. 100 -> print("A")
        in 80 until 90->print("B")
        in 70 until 80->print("C")
        in 60 until 70->print("D")
        else -> print("F")
    }

}
//..은 90~100 모두 포함
// until은 :: a until b 라고 했을 때, a에서 b의 직전까지의 범위를 나타낸다.