import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val M = nextInt()
    var bucket = IntArray(N)

    for (time in 1 .. M){   // 코틀린에서는 루프 변수를 따로 선언하지 않아도 된다. (time, num)
        val i = nextInt()
        val j = nextInt()
        val k = nextInt()

        for(num in i - 1 until j){ // 입력받은 범위(i부터 j까지의 인덱스)에 해당하는 배열요소를
            bucket[num] = k              // 입력받은 값 k 로 변경한다. 배열의 인덱스가 0부터 시작하기에 입력받은 i에서 1을 빼준다.
        }
    }
    bucket.forEach { print("${it} ") }  // 각 요소에 대해 지정된 동작을 수행하며, it으로 각 배열 요소를 출력한다.

}