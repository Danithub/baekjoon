import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true){
        val (a,b,c) = br.readLine().split(" ").map { it.toDouble() }.sorted()
        if(a == 0.0 || b == 0.0 || c == 0.0) break

        if(c.pow(2) == (a.pow(2) + b.pow(2))) bw.write("right\n") else bw.write("wrong\n")
    }
    bw.flush()
}
