import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var panel: Array<Array<String>>
private lateinit var visited: Array<BooleanArray>
var n = 0
var m = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (input1, input2) = br.readLine().split(" ").map { it.toInt() }
    n = input1
    m = input2

    panel = Array<Array<String>>(n){ Array<String>(m){""} }
    visited = Array<BooleanArray>(n){ BooleanArray(m) }

    for (i in 0 until n){
        val inputPanel = br.readLine().map { it.toString() }

        for (j in 0 until m){
            panel[i][j] = inputPanel[j]
        }
    }

    var cnt = 0
    for (i in 0 until n){
        for (j in 0 until m){
            if(!visited[i][j]){
                cnt++

                dfs(i, j, panel[i][j])
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
}

private fun dfs(row: Int, col: Int, panja: String){
    if(panel[row][col] != panja) return
    visited[row][col] = true

    if(panja == "-"){
        if(col + 1 < m && !visited[row][col + 1]){
            dfs(row, col + 1, panja)
        }
    } else{
        if(row + 1 < n && !visited[row + 1][col]){
            dfs(row + 1, col, panja)
        }
    }
}
