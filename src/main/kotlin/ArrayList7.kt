import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var numbers = IntArray(30) { it + 1 }.toMutableList() // 크기가 30, 각 요소에 +1을 해줘서 인덱스에 1을 더한값으로 초기화한다.

    for (num in 0 until 28) {
        val score = nextInt()
        if (score in numbers) {
            numbers.remove(score) //mutableList => remove함수를 이용하여 요소를 제거할 수 있다.
        }
    }

    print("${numbers[0]}\n${numbers[1]}")
}