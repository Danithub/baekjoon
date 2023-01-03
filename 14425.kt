import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val NM = br.readLine().split(" ").map { it.toInt() }

    val stringSet = mutableSetOf<String>()
    repeat(NM[0]){
        stringSet.add(br.readLine())
    }

    var cnt = 0
    repeat(NM[1]){
        if(stringSet.contains(br.readLine())){
            cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()

}
