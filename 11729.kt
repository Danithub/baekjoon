import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val sb = StringBuilder()
    var cnt = 0
    fun aaa(num: Int, start: Int, sub: Int, to: Int){
        if(num == 0) return
        cnt += 1
        aaa(num - 1, start, to, sub)
        sb.append("$start $to\n")
        aaa(num - 1, sub, start, to)
    }

    aaa(n, 1, 2, 3)
    bw.write("${cnt.toString()}\n")
    bw.write(sb.toString())
    bw.flush()
}



