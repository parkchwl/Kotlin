import java.util.Scanner
fun main() = with(Scanner(System.`in`)){
    val grid = Array(9){IntArray(9)} // 9 * 9 사이즈의 배열 생성
    var maxNum = 0
    var maxRow = 0
    var maxCol = 0

    for(i in 0.. 8){
        for(j in 0 .. 8){
            grid[i][j] = nextInt() // 반복문을 이용하여 9x9 배열의 각 요소를 입력받는다.

            if(grid[i][j] > maxNum){ // 현재의 요소가 최대 값인 경우 최대값및 해당 위치의 행과 열의 인덱스를 업데이트 한다.
                maxNum = grid[i][j]
                maxRow = i
                maxCol = j
            }
        }
}

    print("$maxNum\n${maxRow + 1} ${maxCol + 1}")
}