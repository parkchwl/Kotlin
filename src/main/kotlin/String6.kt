fun main() {
    val S = readln().toString()
    var alphabet = IntArray(26){ -1 } // 26개의 알파벳 배열 초기화, 초기값은 -1로 설정

    for(i in S.indices){ // S의 인덱스 범위를 나타낸다.
        if(alphabet[S[i].toInt()-97] == -1 ){ // 알파벳을 0부터 25까지 숫자로 매핑한다. a의 아스키 코드값은 97이므로 'a'의 인덱스는 0.
            alphabet[S[i].toInt()-97 ] = i  // 해당 알파벳이 처음 나타나는 위치(인덱스)를 alphabet 배열에 저장한다.
        }
    }
    alphabet.forEach { print("${it} ") }
}