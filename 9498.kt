import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val score = br.readLine().toInt()
    when(score){
        in 90 .. 100 -> bw.write("A")
        in 80 .. 89 -> bw.write("B")
        in 70 .. 79 -> bw.write("C")
        in 60 .. 69 -> bw.write("D")
        else -> bw.write("F")
    }

    bw.flush()
}
