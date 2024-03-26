import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var s = readLine()
    val lst = Stack<Char>()
    var rst = Stack<Char>()
    for(a in s) lst.push(a)
    for(i in 1..readLine().toInt()) {
        var ip = readLine().split(' ')
        when (ip[0]) {
            "L" -> if(!lst.empty()) rst.push(lst.pop())
            "D" -> if(!rst.empty()) lst.push(rst.pop())
            "B" -> if(!lst.empty()) lst.pop()
            else -> {
                lst.push(ip[1][0])
            }
        }
    }
    println(lst.toCharArray()+rst.toCharArray().reversed())
}