import java.util.*

data class Point(val x: Int, val y: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    val (rows, cols, num) = br.readLine().split(' ').map { it.toInt() }
    val map = Array(rows){ BooleanArray(cols) }

    repeat(num) {
        with(StringTokenizer(br.readLine())) {
            map[nextToken().toInt() - 1][nextToken().toInt() - 1] = true
        }
    }

    fun bfs(x: Int, y: Int): Int {
        val queue : Queue<Point> = LinkedList()
        queue.offer(Point(x, y))
        map[x][y] = false
        var res = 1

        while(queue.isNotEmpty()) {
            val tmp = queue.poll()

            for(i in 0 until 4) {
                val nx = tmp.x + dx[i]
                val ny = tmp.y + dy[i]

                if(nx < 0 || nx >= rows || ny < 0 || ny >= cols) continue
                if(!map[nx][ny]) continue

                map[nx][ny] = false
                queue.add(Point(nx, ny))
                res++
            }
        }

        return res
    }

    var ans = 0

    for(i in 0 until rows) {
        for(j in 0 until cols) {
            if(map[i][j]) {
                ans = maxOf(ans, bfs(i, j))
            }
        }
    }

    bw.write("$ans")
    bw.flush()
    bw.close()
    br.close()
}