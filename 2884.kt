import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (h, m) = br.readLine().split(" ").map { it.toInt() }
    val alarm = h * 60 + m - 45
    var alarmHour = alarm / 60
    var alarmMin = alarm - (alarmHour * 60)

    if(alarmMin < 0){
        alarmHour = 23
        alarmMin += 60
    }
    bw.write("$alarmHour $alarmMin")
    bw.flush()
}
