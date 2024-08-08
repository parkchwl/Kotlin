import java.util.*

data class Balloon(val idx: Int, val move: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val deque : Deque<Balloon> = ArrayDeque()
    val st = StringTokenizer(br.readLine())
    for(i in 1 .. num) {
        deque.add(Balloon(i, st.nextToken().toInt()))
    }

    val sb = StringBuilder()

    while (true) {
        val cur = deque.poll()
        sb.append("${cur.idx} ")
        val move = cur.move

        if(deque.isEmpty()) break

        if(move > 0) {
            for(i in 1 until move) {
                deque.addLast(deque.pollFirst())
            }
        } else {
            for(i in move until 0) {
                deque.addFirst(deque.pollLast())
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}