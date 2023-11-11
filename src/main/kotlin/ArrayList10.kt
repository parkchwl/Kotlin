import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    var score = mutableListOf<Double>()

    repeat(N){
        score.add(nextDouble())
    }

    val M = score.maxOrNull() ?: 0

    for(i in 0 until N){
        score[i] = (score[i] / M.toDouble()) * 100
    }

    print("${score.sum() / N }")
}