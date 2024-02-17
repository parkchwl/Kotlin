import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(InputStreamReader(System.`in`)).use { br ->
        BufferedWriter(OutputStreamWriter(System.out)).use { bw ->
            val st = StringTokenizer(br.readLine())
            var (A, B) = Pair(st.nextToken().toLong(), st.nextToken().toLong())
            var ans = 0

            while (B > A) {
                when {
                    B % 2 == 0L -> B /= 2
                    B % 10 == 1L -> B /= 10
                    else -> {
                        ans = -1
                        break
                    }
                }
                ans++
            }

            if (B != A) {
                ans = -1
            }

            bw.write("$ans\n")
            bw.flush()
        }
    }
}
