fun toNegativeBinary(n: Int): String {
    if (n == 0) return "0"
    
    var result = ""
    var num = n
    
    while (num != 0) {
        val remainder = if (num % -2 < 0) 1 else 0
        result = (remainder + '0'.toInt()).toChar() + result
        num = (num - remainder) / -2
    }
    
    return result
}

fun main() {
    val n = readLine()!!.toInt()
    println(toNegativeBinary(n))
}
