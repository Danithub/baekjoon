import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val list = mutableListOf<Pair<Int,Int>>()
    repeat(n){
        val person = br.readLine().split(" ").map { it.toInt() }
        list.add(Pair(person[0], person[1]))
    }

    for (i:Int in 0 until n){
        var cnt = 0
        for (j:Int in 0 until n){
            if(i == j) continue

            if(list[i].first < list[j].first && list[i].second < list[j].second){
                cnt ++
            }
        }

        bw.write("${cnt+1} ")
    }
    bw.flush()
}
