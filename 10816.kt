import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(20_000_001) // index 0 == -10,000,000 | index 10,000,000 = 0
    val cards = br.readLine().split(" ").map { it.toInt() }
    cards.forEach {
        arr[10_000_000 + it]++
    }

    val m = br.readLine().toInt()
    val sb = StringBuilder()
    val checks = br.readLine().split(" ").map { it.toInt() }
    checks.forEach {
        sb.append("${arr[10_000_000+it]} ")
    }

    bw.write(sb.toString())
    bw.flush()
}
