import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = next()
    val B = nextInt() // N이 몇진법인지 입력받는다.
    var result = 0

    for(i in 0 until N.length){ //0부터 문자열의 길이 만큼 반복한다.
        if('0' <= N[i] && '9' >= N[i]) {
            result = result * B + (N[i] - '0') // 현재 자릿수가 0~9까지의 숫자면, 10진수로 변환하여 result에 더한다.
        } else {
            result = result * B + (N[i] - 'A' + 10) // 0~9가 아니라면 'A'~'Z' 알파벳 중 하나이다. 그렇다면 알파벳을 10진수로 변환
        }
    }

    print(result)
}