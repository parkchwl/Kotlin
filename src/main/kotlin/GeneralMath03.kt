import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val test = nextInt() // 테스트 케이스의 경우. 입력 실행 횟수.

    repeat(test){
        var c = nextInt() // 거스름돈 c

        val quater = c / 25
        c %= 25 // 나머지 값을 c에 갱신한다.

        val dime = c / 10
        c %= 10

        val nickel = c / 5
        c %= 5

        val penny = c

        println("$quater $dime $nickel $penny")
    }
}