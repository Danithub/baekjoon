import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(n+1){ Array(k+1){ i -> 1} }

    //println("${arr.contentDeepToString()}")
    for (i:Int in 1 .. k){
        for (j:Int in i + 1 .. n){
            arr[j][i] = (arr[j-1][i-1] + arr[j-1][i]) % 10_007
        }
    }

    //println("${arr.contentDeepToString()}")
    bw.write("${arr[n][k]}")
    bw.flush()
}
