fun main(){
    val num = readln().toInt()

    for(i in 1 until num){
        for(j in 1 until num -i +1){
            print(" ")
        }
        for(j in 1 until 2 * i){
            print("*")
        }
        println()
    }

    for (i in num downTo 1){    //downTo 함수는 정수 범위를 역순으로 반복하는데 사용한다. [정수를 역순으로 순회]
        for(j in 1 until num -i +1){
            print(" ")
        }
        for(j in 1 until 2 * i){
            print("*")
        }
        println()
    }
}
