fun main(){
    val num = readln().toInt()
    var result = "int"
    for (i in 1..num /4){
        result = "long ${result}"
    }
    print(result)

}