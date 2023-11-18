import java.util.Scanner
fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val M = nextInt()
    val arr = Array(N){IntArray(M)} // N * M 크기의 2차원 배열 생성

    for(i in 0 until N){    // i, j에 각 배열의 요소 입력받는다.
        for(j in 0 until M){
            arr[i][j] = nextInt()
        }
    }

    for (i in 0 until N){   // 배열의 각 요소에 입력 받은 값을 더한다.
        for(j in 0 until M){
            arr[i][j] += nextInt()
        }
    }

    for(i in 0 until N){
        for(j in 0 until M){
            print("${arr[i][j]} ")
        }
        println()
    }
}