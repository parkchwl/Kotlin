import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var H = nextInt()
    var M = nextInt()

    if(M-45 < 0){
        if(H<=0){
            H = 24
            H--
            M = M+60 -45
        } else {
            H--
            M = M + 60 -45
        }
    } else {
        M -= 45
    }
    print("$H $M")
}