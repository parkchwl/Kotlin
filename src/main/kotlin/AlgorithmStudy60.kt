fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val mode = br.readLine().split(' ').map { it.toInt() }
    val queueStack = br.readLine().split(' ').map { it.toInt() }
    var m = br.readLine().toInt()
    val insert = br.readLine().split(' ').map { it.toInt() }

    val sb = StringBuilder()
    for(i in num - 1 downTo 0) { // 마지막 큐부터 출력
        if(m == 0) break // 삽입된만큼 출력하면 종료
        if(mode[i] == 0) { // 큐
            sb.append("${queueStack[i]} ")
            m--
        }
    }
    for(i in insert.indices) { // 삽입된 원소 출력
        if(m == 0) break
        sb.append("${insert[i]} ")
        m--
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}