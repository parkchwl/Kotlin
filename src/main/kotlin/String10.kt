fun main() {
    val dial = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    val word = readLine()!!.toString()
    var result = 0

    for (i in word.indices) {
        for (j in dial) {
            if (j.contains(word[i])) {
                result += dial.indexOf(j) + 3
            }
        }
    }
    print(result)
}