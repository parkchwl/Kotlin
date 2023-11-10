import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val chess = arrayOf(1, 1, 2, 2, 2, 8)
    var result = IntArray(6){0} // 크기가 6인 정수배열, 0으로 초기화
    var index = 0

    for(i in chess){
        result[index] = i - nextInt() //현재 반복중인 chess 배열의 요소에서 사용자로부터 정수를 입력받아 차이를 계산하고 result 배열에 저장
        index++
    }

    result.forEach { print("${it} ") }

}