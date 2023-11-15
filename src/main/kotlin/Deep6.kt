fun main() {
    val cAlpha = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readLine()!!.toString()

    cAlpha.forEach {
        str = str.replace(it, " ")
    }

    print(str.length)

}