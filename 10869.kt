import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    sb.append("${a+b}\n")
    sb.append("${a-b}\n")
    sb.append("${a*b}\n")
    sb.append("${a/b}\n")
    sb.append("${a%b}\n")
    bw.write("${sb.toString()}")
    bw.flush()
}
