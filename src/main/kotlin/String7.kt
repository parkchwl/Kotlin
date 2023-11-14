import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    repeat(nextInt()) {
        val count = nextInt()
        val S = next()
        var result = ""

        for(i in S.indices){    //indices 인덱스 범위를 반환. S가 입력받은 값이 3이라면, S.indices는 0..2까지가 범위이다.
            repeat(count){
                result += S[i]
            }
        }
        println(result)

    }
}