import java.util.*;
import java.io.*;

fun main() {
    var br = BufferedReader( InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    var sb = StringBuilder();

    var M = st.nextToken().toInt()
    var N = st.nextToken().toInt()
    var arr = Array(N+1, {false})
    arr[0] = true; arr[1] = true;

    for(i in 2.. Math.sqrt(N+1.toDouble()).toInt()) {
        if(arr[i] == true) {
            continue;
        }

        for(j in i*i..N step +i) {
            arr[j] = true;
        }
    }

    for(i in M..N) {
        if(arr[i] == false) {
            sb.append(i).append('\n')
        }
    }

    print(sb)
} 