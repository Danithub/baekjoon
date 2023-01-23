import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var beach: Array<Array<String>>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    beach = Array(n){ Array(m){""} }
    for (i in 0 until n){
        val row = br.readLine().map { it.toString() }
        for (j in 0 until m){
            beach[i][j] = row[j]
        }
    }

    val cnt = dfsToAddLength(0, 0, n, m)
    bw.write("$cnt")
    bw.flush()
}

private fun dfsToAddLength(row: Int, col: Int, endRow:Int, endCol: Int): Int{
    if(row == endRow) return 0

    val now = beach[row][col] //현재위치가 물인지 땅인지

    var cnt = 0
    // 위, 왼쪽, 아래 3곳과 비교하여 현재 속성과 다르면 +1
    // row가 짝수일 경우 0, 2, 4
    if(row % 2 == 0){
        // 위
        if(row - 1 >= 0 && col - 1 >= 0 && beach[row-1][col - 1] != now) cnt++
        // 왼쪽
        if(col - 1 >= 0 && beach[row][col - 1] != now) cnt++
        // 아래
        if(row + 1 < endRow && col - 1 >= 0 && beach[row+1][col - 1] != now) cnt++

    } else{
        // row가 홀수일 경우 1, 3, 4
        // 위
        if(row - 1 >= 0 && beach[row-1][col] != now) cnt++
        // 왼쪽
        if(col - 1 >= 0 && beach[row][col - 1] != now) cnt++
        // 아래
        if(row + 1 < endRow && beach[row+1][col] != now) cnt++
    }

    if(col == endCol - 1){
        cnt += dfsToAddLength(row + 1, 0, endRow, endCol)
    } else {
        cnt += dfsToAddLength(row, col + 1, endRow, endCol)
    }

    return cnt
}
