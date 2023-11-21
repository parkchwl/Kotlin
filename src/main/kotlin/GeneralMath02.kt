import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var N = nextInt()
    val B = nextInt()
    var result = StringBuilder() // 변환된 결과를 저장하기 위한 StringBuilder 객체를 초기화한다.

    while (N > 0){ // 입력받은 10진수 N의 값이 0보다 크면 반복한다.
        if(N % B <10){ // N % B 가 10보다 작다면, 숫자로 처리한다.
            result.append((N % B + '0'.toInt()).toChar()) // 현재 자릿수를 문자열로 변환하여 결과에 추가한다. 숫자->문자로 변환.

        } else { // N % B 가 10 이상이면 알파벳으로 처리한다.
            result.append((N % B - 10 + 'A'.toInt()).toChar()) // 알파벳을 문자로 변환하는 과정.
        }

        N = N / B // N/B를 하고 N의 값을 갱신한다. 지정한 진법으로 변환하고, N이 더이상 변환할 수 없다면 반복문(while)문이 종료된다.
    }

    print(result.reversed())
}