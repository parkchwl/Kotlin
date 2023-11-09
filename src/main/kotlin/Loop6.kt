import java.io.*

fun main() {
    // BufferedReader와 BufferedWriter를 사용하여 입력 및 출력 최적화
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // 테스트케이스의 개수를 입력받음
    val t = br.readLine().toInt()

    // 테스트케이스의 개수만큼 반복
    repeat(t) {

        val input = br.readLine().split(" ")         // 각 테스트케이스에서 공백을 기준으로 나눠 입력을 받음
        val a = input[0].toInt() // 첫 번째 정수를 변수 a에 저장
        val b = input[1].toInt() // 두 번째 정수를 변수 b에 저장

        val sum = a + b // 두 정수를 더해서 sum에 저장

        bw.write("$sum\n") // 결과를 BufferedWriter를 통해 출력 write 메서드를 사용하였다.
    }

    bw.flush() // 출력 버퍼 비우기
    bw.close() // BufferedWriter 닫기

    // close()는 BufferedWriter를 닫아 사용한 리소스를 해제합니다.
    // 이를 통해 버퍼가 닫히고 더 이상 데이터를 쓰거나 BufferedWriter를 사용할 수 없게 됩니다.
    // 프로그램이 종료될 때, 자원 누출을 방지하기 위해 일반적으로 사용됩니다.
}
/*
    [1] BufferedReader 와 BufferWriter는 입력 및 출력을 보다 효율적으로 처리할 수 있는 클래스이다.
        BufferedReader는 입력 스트림으로부터 데이터를 읽을 때 사용된다. System.in은 표준 입력스트림을 나타낸다.
        InputStreamReader는 바이트 스트림을 문자 스트림으로 변환하는 역할을 한다.
        * 'br'는 표준 입력 스트림으로 읽어들이기 위한 BufferedReader 객체를 생성하고 초기화한것이다.


    [2] BufferedWriter를 사용한 출력('val bw = BufferWriter(OutputStreamWriter(System.out))
        BufferedWriter는 출력 스트림에 데이터를 쓸 때 사용된다. System.out은 표준 출력 스트림을 나타낸다.
        OutputStreamWriter는 문자 스트림을 바이트 스트림으로 변환하는 역할을 한다.
        * 'bw'는 표준 출력 스트림으로 데이터를 출력하기 위한 BufferedWriter 객체를 생성하고 초기화한것이다.
 */