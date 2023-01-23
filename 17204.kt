import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val arr = IntArray(n)
    for (i in 0 until n){
        arr[i] = br.readLine().toInt()
    }

    var cnt = 0
    var idx = 0
    while(true){
        ++cnt
        val temp = arr[idx]
        if(temp == k) break
        idx = temp
        if(cnt > n) break
    }

    if(cnt>n) bw.write("-1") else bw.write("$cnt")
    bw.flush()
}
