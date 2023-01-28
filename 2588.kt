import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val(m1, m2, m3) = br.readLine().map { it - '0' }

    val fir = n * m3
    val sec = n * m2
    val thir = n * m1

    bw.write("$fir\n")
    bw.write("$sec\n")
    bw.write("$thir\n")
    bw.write("${fir+sec*10+thir*100}")
    bw.flush()
}
