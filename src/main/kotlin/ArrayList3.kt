import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val num = nextInt()
    var nums = ArrayList<Int>()

    for(i in 1..num){
        nums.add(nextInt())
    }

    print("${nums.min()} ${nums.max()}")    //리스트에서 최소값과 최대 값을 찾아 출력한다.

}