import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val(a, b, c) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${(a+b)%c}\n")
    bw.write("${((a%c) + (b%c))%c}\n")
    bw.write("${(a*b)%c}\n")
    bw.write("${((a%c)*(b%c))%c}")

    bw.flush()
}
