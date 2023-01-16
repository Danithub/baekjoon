import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

lateinit var arr: IntArray
lateinit var visit: BooleanArray
val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    arr = IntArray(m)
    visit = BooleanArray(n + 1)
    dfs(0, n, m)
    bw.write(sb.toString())
    bw.flush()
}

fun dfs(idx:Int, n: Int, m: Int) {
    if(idx == m){
        arr.forEach {
            sb.append(it).append(" ")
        }
        sb.append("\n")
        return
    }

    for (i in 1 .. n){
            visit[i] = true
            arr[idx] = i
            dfs(idx + 1, n, m)
            visit[i] = false

    }
}
