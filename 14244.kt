import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    for(i in 0 until m - 1){
        sb.append("${i} ${m-1}\n")
    }
    for(i in m-1 until n-1){
        sb.append("${i} ${i+1}\n")
    }

    bw.write("${sb.toString()}")
    bw.flush()
}
