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
        var (a, b) = br.readLine().split(" ").map { it.toInt() }

        while(true){
            if(a == b) break
            else if (a > b) a /= 2
            else b /= 2
        }

        sb.append("${10 * a}\n")
    }

    bw.write("${sb.toString()}")
    bw.flush()
}
