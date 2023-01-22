import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()

    val t = br.readLine().toInt()
    for (i:Int in 0 until t){
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        for (j:Int in 0 until m){
            br.readLine()
        }
        sb.append("${n - 1}\n")
    }

    bw.write("${sb.toString()}")
    bw.flush()
}
