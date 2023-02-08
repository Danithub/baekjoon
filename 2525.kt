import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (h, m) = br.readLine().split(" ").map { it.toInt() }
    val min = br.readLine().toInt()

    val time = h * 60 + m + min
    var completeHour = time / 60
    val completeMin = time - completeHour * 60
    if(completeHour >= 24) completeHour -= 24


    bw.write("$completeHour $completeMin")
    bw.flush()
}
