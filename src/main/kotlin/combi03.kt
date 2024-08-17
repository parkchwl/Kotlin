fun main(){
    println(factorial(readln().toInt()))
}

fun factorial(n: Int): Int {
    val array = IntArray(n+1){1}

    for(i in 1..n) array[i] = array[i - 1] * i
return array[n]
}