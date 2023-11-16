fun main() {
    val scoreMap: Map<String, Double> = mapOf(  // scoreNap : Map <String, Double> 키와 값의 쌍으로 이루어짐.
        "A+" to 4.5,                            // String 은 키(key) 타입으로 이루어지고 , Double은 값(Value)의 타입을 나타낸다.
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0,
    )

    var total: Double = 0.0
    var totalSocre : Double = 0.0

    for(i in 0 until 20){
        val info: String = readLine()!!
        val infoList = info.split(" ") // 입력된 문자열을 공백을 기준으로 분할하여 리스트로 저장한다,
        val score: Double = infoList[1].toDouble() // leadLine으로 받은 값을 Double로 변환하여 socre에 저장한다.
        val grade: String = infoList[2]             // 학점을 나타내는 문자열을 grade 변수에 저장한다.

        if(grade.equals("P")) continue
        total += scoreMap.get(grade)!! * score
        totalSocre += score
    }
    print(total/totalSocre)
}