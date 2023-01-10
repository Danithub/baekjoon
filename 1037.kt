import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }.sorted()

    val min = list.first()
    val max = list.last()

    bw.write("${min * max}")
    bw.flush()

}
