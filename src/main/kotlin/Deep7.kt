import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var count = 0

    repeat(nextInt()){
        val word = next()

        for(i in word.indices){
            if( i != word.length -1){
                if(word[i] == word[i+1]){
                    continue
                } else if (word[i] in word.substring(i+1, word.length)){
                    break
                }
            } else {
                count += 1
            }
        }
    }
    print(count)
}