fun main() {
    val year = readLine()!!.toInt() // readLine():입력된 값을 문자열로 저장,  // !! : null값 검사를 무시한다. // toInt(): 정수변환

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        print("1")
    } else {
        print("0")
    }
}