import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val num = nextInt() // 배열의 범위 값으로 쓰일 숫자 num을 입력받는다.
    var nums = ArrayList<Int>()

    for(i in 1..num){
        nums.add(nextInt()) //num번 만큼 숫자를 입력받고 배열 nums에 저장한다.
    }

    print("${nums.min()} ${nums.max()}")    //리스트에서 최소값과 최대 값을 찾아 출력한다.

}