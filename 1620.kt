import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (N,M) = br.readLine().split(" ").map { it.toInt() }

    val hash = hashMapOf<String, String>()
    for (i:Int in 0 until N){
        val poketmon = br.readLine()
        hash["${i+1}"] = poketmon
        hash[poketmon] = "${i+1}"
    }

    repeat(M){
        bw.write(hash[br.readLine()]+"\n")
    }

    bw.flush()

}
