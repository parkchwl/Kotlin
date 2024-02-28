import java.util.LinkedList
import java.util.Queue

data class Node(val x: Int, val y: Int, val count: Int, val k: Int)

fun main() {
    val scan = java.util.Scanner(System.`in`)

    val k = scan.nextInt()
    val w = scan.nextInt()
    val h = scan.nextInt()

    val board = Array(h) { IntArray(w) }
    for (i in 0 until h) {
        for (j in 0 until w) {
            board[i][j] = scan.nextInt()
        }
    }

    val visited = Array(h) { Array(w) { BooleanArray(k + 1) } }
    val result = bfs(0, 0, k, board, visited, h, w)

    if (result == Int.MAX_VALUE) {
        println("-1")
    } else {
        println(result)
    }
}

fun bfs(x: Int, y: Int, k: Int, board: Array<IntArray>, visited: Array<Array<BooleanArray>>, h: Int, w: Int): Int {
    val q: Queue<Node> = LinkedList()
    q.offer(Node(x, y, 0, k))
    visited[x][y][k] = true

    while (q.isNotEmpty()) {
        val current = q.poll()
        if (current.x == h - 1 && current.y == w - 1) return current.count

        for (i in 0 until 4) {
            val nx = current.x + dx[i]
            val ny = current.y + dy[i]
            if (isValid(nx, ny, h, w) && !visited[nx][ny][current.k] && board[nx][ny] == 0) {
                visited[nx][ny][current.k] = true
                q.offer(Node(nx, ny, current.count + 1, current.k))
            }
        }

        if (current.k > 0) {
            for (i in 0 until 8) {
                val nx = current.x + hdx[i]
                val ny = current.y + hdy[i]
                if (isValid(nx, ny, h, w) && !visited[nx][ny][current.k - 1] && board[nx][ny] == 0) {
                    visited[nx][ny][current.k - 1] = true
                    q.offer(Node(nx, ny, current.count + 1, current.k - 1))
                }
            }
        }
    }
    return Int.MAX_VALUE
}

fun isValid(x: Int, y: Int, h: Int, w: Int): Boolean = x in 0 until h && y in 0 until w

private val dx = intArrayOf(0, 1, 0, -1)
private val dy = intArrayOf(1, 0, -1, 0)
private val hdx = intArrayOf(-2, -2, -1, -1, 1, 1, 2, 2)
private val hdy = intArrayOf(-1, 1, -2, 2, -2, 2, -1, 1)
