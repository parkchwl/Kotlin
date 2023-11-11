import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val num = nextInt() //사용자로부터 정수 입력 받기
    var nums = ArrayList<Int>() //정수를 저장할 ArrayLinst<>()생성

        for(i in 1.. num) { //입력받은 정수만큼 반복하여
            nums.add(nextInt())   // 리스트에 정수를 저장한다.
    }
    val search = nextInt()  //검색할 정수를 입력 받기.

    var result = 0          // 결과를 저장할 변수 초기화. Search한 정수의 결과값을 말한다.

    for (i in nums){        // 리스트에 저장된 값들과 검색할 값을 비교하여 일치하는 경우에 result 값이 1 증가한다.
        if( i == search) {
            result+= 1
        }
    }

    print(result)
}