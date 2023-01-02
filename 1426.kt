import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var cnt = 0
    var number = 666
    while (number >= 666){
        if(number.toString().indexOf("666") > -1){
            cnt++
        }

        if(cnt == n) break
        else number++
    }
    bw.write(number.toString())
    bw.flush()
}
