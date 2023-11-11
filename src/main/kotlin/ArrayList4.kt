import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var nums = ArrayList<Int>()

    for (i in 1 .. 9){
        nums.add(nextInt())
    }
    print("${nums.max()} ${nums.indexOf(nums.max()) + 1}") // index는 0부터 시작하기에 + 1 을 더하여, 몇번째 줄인지 나타내준다.
}
