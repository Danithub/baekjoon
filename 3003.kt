import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pieces = br.readLine().split(" ").map { it.toInt() }
    val origin = arrayOf(1, 1, 2, 2, 2, 8)

    val sb = StringBuilder()
    for (i in pieces.indices){
        sb.append("${origin[i] - pieces[i]} ")
    }

    bw.write(sb.toString())
    bw.flush()
}
