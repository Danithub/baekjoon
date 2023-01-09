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

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    if(k < 0 || k > n){
        // 0
        sb.append("0")
    } else {
        // n!/k!(n-k)!
        sb.append("${(factorial(n) / (factorial(k) * factorial(n - k)))}")
    }

    bw.write(sb.toString())
    bw.flush()
}

fun factorial(i: Int): Int{
    var r = 1
    for(i:Int in i downTo 1) r *= i
    return r
//    if(i == 1) return 1
//    return i * factorial(i - 1)
}
