fun main(){
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val lis = IntArray(n) { 1 }
    val prev = IntArray(n){ -1 }

    for(i in 1 until n){
        for(j in 0 until i){
            if(a[j] < a[i] && lis[i] < lis[j] + 1){
                lis[i] = lis[j] + 1
                prev[i] = j
            }
        }
    }

    val maxLength = lis.maxOrNull()!!
    println(maxLength)

        val lisSequence = mutableListOf<Int>()
    var index = lis.indexOf(maxLength)
    while (index != -1) {
        lisSequence.add(a[index])
        index = prev[index]
    }
    lisSequence.reverse()

    println(lisSequence.joinToString(" "))
}

//BOJ 14002_가장 긴 증가하는 부분 수열 4