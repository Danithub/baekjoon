import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var t = br.readLine().toInt()

    val dp = Array(31){ Array(31){ i -> 1} }

    for(i:Int in 1 .. 30){
        dp[i][1] = i
        for(j:Int in 2 until i){
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        }
        dp[i][i] = 1
    }

    while(t-->0){
        val (r, n) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${dp[n][r]}\n")
    }

    bw.flush()
}
