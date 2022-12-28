import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()

    for (i:Int in 0 until n){
        val st = StringTokenizer(br.readLine())
        val pair = Pair(st.nextToken().toInt(), st.nextToken().toInt())
        list.add(pair)
    }

    list.sortWith(compareBy({it.first}, {it.second}))
    list.forEach { bw.write("${it.first} ${it.second}\n") }
    bw.flush()
}
