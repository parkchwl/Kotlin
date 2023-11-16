import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var result = ""
    var word = Array(5) { CharArray(15) { ' ' } } // 5개의 문자열을 저장할 이차원 배열 선언과 초기화. 최대 길이는 15로 함.
    var maxSize = 0

    for (i in 0 until 5) {
        val input = next()
        maxSize = Math.max(maxSize, input.length) // Math.max 함수를 사용하여 input.length의 값(input으로 받은 값의 길이)와 maxSize를 비교한다.
        // 그리고 Math.max로 더 큰 값을 반환하여 maxSize에 값을 넣는다.
        word[i] = input.toCharArray()
    }
    for (i in 0 until maxSize) {
        for (j in 0 until 5) {
            if (word[j].getOrNull(i) == null)
                continue    // 해당열에 문자가 없는 경우 다음 열로 넘어간다.


            result += word[j][i]
        }
    }

    print(result)
}