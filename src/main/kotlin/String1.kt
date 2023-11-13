import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    print("${next()[nextInt() - 1]}")   // nextInt()를 사용하여 정수를 읽어온다 -> [ ] 를 사용하여 문자열에서 특정 위치에 있는 문자를 선택
}                                       // -1 을 사용하여 0을 기반으로 하는 인덱스를 1을 기반으로 하는 인덱스로 변화한다.