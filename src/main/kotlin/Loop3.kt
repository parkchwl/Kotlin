fun main(){
    val num = readln().toInt()
    var sum = 0

    for (i in 1 .. num){
        sum += i
    }

    print(sum)
}