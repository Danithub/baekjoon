import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

private var n = 0
private var cnt = 0
//private var board = Array(15){ IntArray(15) }
private var col = Array(15){0}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    n = br.readLine().toInt()

    _dfs(0)

    bw.write("$cnt")
    bw.flush()
}

private fun _dfs(rowIdx: Int){
    if(rowIdx == n) cnt++
    else{
        for (i in 0 until n){
            col[rowIdx] = i
            if(isThereQueen(rowIdx)){
                _dfs(rowIdx + 1)
            }
        }
    }
}

private fun isThereQueen(rowIdx: Int): Boolean{
    for (i in 0 until rowIdx){
        if(col[i] == col[rowIdx] || abs(col[rowIdx] - col[i]) == rowIdx - i) return false
    }

    return true
}
