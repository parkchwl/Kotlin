import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val graph = Array(100) { BooleanArray(100)} // Boolean임으로, 기본적으로 False로 초기화 되어있다.
    var total = 0

    repeat(nextInt()){
        val x = nextInt()
        val y = nextInt()

        for(i in x until x + 10){ // 반복문을 사용하여 입력받은 좌표(x,y)를 기준으로 10x10 크기의 직사각형 영역을 표시.
            for(j in y until y + 10){ // graph[i][j]가 true인 경우 무시하고, 그렇지 않은 경우에만 표시하고 total을 증가시킨다.
                if(graph[i][j]) continue
                graph[i][j] = true
                total++
            }
        }
    }
    print(total)
}