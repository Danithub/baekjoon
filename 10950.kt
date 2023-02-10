import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    for (i in 0 until n){
        val(a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${a+b}\n")
    }

    bw.flush()
}
