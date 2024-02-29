fun main() {
    val matrix = Array(5) { readLine()!!.toCharArray() }
    var count = 0

    fun isValid(x: Int, y: Int, selected: List<Pair<Int, Int>>): Boolean {
        if (x < 0 || x >= 5 || y < 0 || y >= 5) return false
        if (selected.contains(x to y)) return false
        return true
    }

    fun isAdjacent(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1
    }

    fun dfs(x: Int, y: Int, selected: List<Pair<Int, Int>>, idaCount: Int) {
        if (selected.size == 7) {
            if (idaCount >= 4) {
                count++
            }
            return
        }

        for (dx in -1..1) {
            for (dy in -1..1) {
                val nx = x + dx
                val ny = y + dy

                if (isValid(nx, ny, selected) && isAdjacent(x, y, nx, ny)) {
                    val nextSelected = selected.toMutableList()
                    nextSelected.add(nx to ny)

                    if (matrix[nx][ny] == 'S') {
                        dfs(nx, ny, nextSelected, idaCount + 1)
                    } else {
                        dfs(nx, ny, nextSelected, idaCount)
                    }
                }
            }
        }
    }

    for (i in 0 until 5) {
        for (j in 0 until 5) {
            dfs(i, j, listOf(i to j), if (matrix[i][j] == 'S') 1 else 0)
        }
    }

    println(count)
}
