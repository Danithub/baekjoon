import java.awt.Point
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    while (true){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        if(a==0) break

        if(a < b){
            if(b % a == 0) {
                sb.append("factor\n")
                continue
            }
        } else{
            if(a % b == 0) {
                sb.append("multiple\n")
                continue
            }
        }

        sb.append("neither\n")
    }

    bw.write(sb.toString())
    bw.flush()
}
