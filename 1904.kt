import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = Array(1_000_001) { 0 }
    arr[1] = 1
    arr[2] = 2

    for (i in 3..n) {
        arr[i] = (arr[i - 1] + arr[i - 2])%15746
    }

    bw.write("${arr[n]}")
    bw.flush()
}
