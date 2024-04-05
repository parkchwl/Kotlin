import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()

    val reversedWords = StringBuilder()
    val wordBuilder = StringBuilder()

    var insideTag = false

    for (char in str) {
        when (char) {
            '<' -> {
                reversedWords.append(wordBuilder.reverse())
                wordBuilder.clear()
                insideTag = true
            }
            '>' -> {
                reversedWords.append('>')
                insideTag = false
            }
            ' ' -> {
                if (insideTag) wordBuilder.append(char)
                else {
                    reversedWords.append(wordBuilder.reverse()).append(' ')
                    wordBuilder.clear()
                }
            }
            else -> {
                if (insideTag) reversedWords.append(char)
                else wordBuilder.append(char)
            }
        }
    }

    reversedWords.append(wordBuilder.reverse())

    println(reversedWords)
}
