import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var board: Array<Array<Int>>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n  = br.readLine().toInt()

    board = Array(n){ Array(n){ 0 } }
    for (i in 0 until n){
        val row = br.readLine().split(" ").map { it.toInt() }

        for (j in row.indices){
            board[i][j] = row[j]
        }
    }

    if(jump(0, 0, n - 1) > 0){
        bw.write("HaruHaru")
    } else{
        bw.write("Hing")
    }

    bw.flush()
}

private fun jump(row: Int, col: Int, endIndex: Int): Int{
    if(row == endIndex && col == endIndex) return 1
    else if(row > endIndex || col > endIndex) return 0

    var cnt = 0

    val number = board[row][col]
    if(number == 0) return 0

    // 오른쪽으로 점프할 경우
    cnt += jump(row, col + number, endIndex)

    // 아래쪽으로 점프할 경우
    cnt += jump(row + number, col, endIndex)

    return cnt
}
