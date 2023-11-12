import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val N = nextInt()
    val M = nextInt()
    var bucket = IntArray(N){it + 1} // 초기 상태의 바구니 배열 생성

    for (time in 0 until M){ // M번 공을 바꾼다.
        val i = nextInt()
        val j = nextInt()

        val tmp = bucket[i - 1] // i번 바구니와 j번 바구니의 공을 교환한다.
        bucket[i - 1] = bucket[j - 1]
        bucket[j - 1] = tmp
    }

    bucket.forEach { print("${it} ") }
}
/* +1을 해주는 이유 :
IntArray(N) { it + 1} 은 1부터 N까지의 값을 갖는 배열을 생성한다.
it는 배열의 인덱스를 나타내며, 각 인덱스에 1을 더해줌으로써 배열의 요소가 1부터 시작하도록 만든다
여기에서 +1을 하는 이유는 바구니에서 1부터 N번까지 번호가 매겨져 있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있기 때문이다.
한줄로 요약하자면 :: 번호가 적힌공 => but, 인덱스는 번호가 0부터 시작하므로 +1을 해줘야한다.

-1을 해주는 이유 :
bucket[i - 1]과 bucket[j - 1]
위와 같은 이유로 인덱스는 0부터 시작하므로 배열의 실제 인덱스에 접근하기 위하여 -1을 해준다.
tmp로 임시값을 저장하고 두 바구니의 값을 교환한다.
 */