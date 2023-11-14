fun main() {
    // trim()은 문자열의 앞뒤 공백을 제거한다. split(" ")으로 공백을 기준으로 문자열을 나누고, toMutableList()로 리스트로 변환한다.
    val S = readln().trim().split(" ").toMutableList() // 입력된 문자열이 공백을 기준으로 입력된 단어들이 리스트로 저장된다.
    S.removeAll(listOf("")) // removeAll함수는 리스트에서 주어진 요소들을 모두 제거하는 함수. 여기서는 빈 문자열들을 전부 제거하도록 사용되었다.
    print("${S.size}") // S.size로 요소들의 개수를 출력한다.
}