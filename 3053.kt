import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val radius = br.readLine().toInt()

    val sb = StringBuilder()
    val ans1 = Math.PI* radius.toDouble().pow(2.0)
    sb.append(String.format("%.6f\n", ans1))
    val ans2 = 2*Math.pow(radius.toDouble(), 2.0)
    sb.append(String.format("%.6f", ans2))

    bw.write(sb.toString())
    bw.flush()
}
