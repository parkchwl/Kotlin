import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val X = nextInt()
    var arr = ArrayList<Int>()

    for (i in 1 .. N){ // 1부터 N까지 반복
        var num = nextInt()  // 표준 입력 num을 읽어온다.
        if(num < X){         // num이 X보다 작다면 해당 값을 출력한다.
            print("$num ")
        }
    }
}