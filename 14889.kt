import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.min

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val ability = Array(n){ IntArray(n) }
    val visit = BooleanArray(n)
    for (i in 0 until n){
        val input = br.readLine().split(" ").map { it.toInt() }
        for (j in input.indices){
            ability[i][j] = input[j]
        }
    }

    aaa(0, 0, n, ability, visit)
    bw.write("$min")
    bw.flush()
}

private fun aaa(idx: Int, count: Int, teamCnt: Int, map: Array<IntArray>, visited: BooleanArray){
    if(count == teamCnt / 2){
        bbb(teamCnt, map, visited)
        return
    }

    for (i in idx until teamCnt){
        if(!visited[i]){
            visited[i] = true
            aaa(i + 1, count + 1, teamCnt, map, visited)
            visited[i] = false
        }
    }
}

private var min = Int.MAX_VALUE
private fun bbb(teamCnt: Int, map: Array<IntArray>, visited: BooleanArray){
    var teamStart = 0
    var teamLink = 0

    for (i in 0 until teamCnt-1){
        for (j in i+1 until teamCnt){
            if(visited[i] && visited[j]){
                teamStart += map[i][j]
                teamStart += map[j][i]
            }
            else if (!visited[i] && !visited[j]){
                teamLink += map[i][j]
                teamLink += map[j][i]
            }
        }
    }

    val diff = abs(teamStart - teamLink)

    min = min(diff, min)
}
