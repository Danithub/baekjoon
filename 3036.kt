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

    val cnt = br.readLine().toInt()
    val rings = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for (i:Int in 1 until cnt){
        val gcd = gcd(rings[0], rings[i])
        sb.append("${(rings[0] / gcd)}/${(rings[i] / gcd)}\n")
    }

    bw.write(sb.toString())
    bw.flush()
}

fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
