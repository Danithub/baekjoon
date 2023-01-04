import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    val set = mutableSetOf<String>()
    val sb = StringBuilder()
    sb.append(s)
    for (i:Int in s.indices){
        for(j:Int in i until s.length){
            set.add(sb.substring(i, j+1))
        }
    }

    bw.write("${set.size}")
    bw.flush()
}
