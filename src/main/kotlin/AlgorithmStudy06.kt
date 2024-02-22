import java.util.Scanner

class AlgorithmStudy06 {
    companion object {
        var n = 0
        var m = 0
        var r = 0
        var c = 0
        var d = 0
        var board: Array<IntArray> = emptyArray()
        var count = 1
        val dx = arrayOf(-1, 0, 1, 0)
        val dy = arrayOf(0, 1, 0, -1)

        @JvmStatic
        fun main(args: Array<String>) {
            val scan = Scanner(System.`in`)

            n = scan.nextInt()
            m = scan.nextInt()
            r = scan.nextInt()
            c = scan.nextInt()
            d = scan.nextInt()

            board = Array(n) { IntArray(m) }
            for (i in 0 until n) {
                for (j in 0 until m) {
                    board[i][j] = scan.nextInt()
                }
            }

            dfs(r, c, d)
            println(count)
        }

        fun dfs(x: Int, y: Int, dir: Int) {
            board[x][y] = 2

            for (i in 0 until 4) {
                val currentDir = (dir + 3 - i) % 4
                val nx = x + dx[currentDir]
                val ny = y + dy[currentDir]
                
                if (nx in 0 until n && ny in 0 until m && board[nx][ny] == 0) {
                    count++
                    dfs(nx, ny, currentDir)
                    return
                }
            }

            val backDir = (dir + 2) % 4
            val bx = x + dx[backDir]
            val by = y + dy[backDir]
            if (bx in 0 until n && by in 0 until m && board[bx][by] != 1) {
                dfs(bx, by, dir)
            }
        }
    }
}
