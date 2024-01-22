import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map(String::toInt)

    val mapInt = (1..n).associateWith { br.readLine() }
    val mapStr = mapInt.entries.associate { it.value to it.key }

    val sb = StringBuilder()

    repeat(m) {
        val tmp = br.readLine()
        sb.append(if (tmp.isNumeric()) mapInt[tmp.toInt()] else mapStr[tmp]).append("\n")
    }

    println(sb)
}

fun String.isNumeric(): Boolean = all { it.isDigit() }
