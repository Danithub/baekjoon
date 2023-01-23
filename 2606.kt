import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var computers : Array<IntArray>
private lateinit var visited : BooleanArray
private var virusCnt = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val computerCnt = br.readLine().toInt()
    val lineCnt  = br.readLine().toInt()

    computers = Array(computerCnt + 1){ IntArray(computerCnt + 1) }
    visited = BooleanArray(computerCnt + 1)

    for (i in 0 until lineCnt){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        computers[a][b] = 1
        computers[b][a] = 1
    }

    dfs(1)

    bw.write("$virusCnt")
    bw.flush()
}

private fun dfs(n: Int){
    if(n != 1){
        virusCnt++
    }

    visited[n] = true
    var cnt = 0
    for (i in 1 .. computers.lastIndex){
        if(!visited[i] && computers[n][i] == 1){
            dfs(i)
        }
    }
}
