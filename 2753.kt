import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val year = br.readLine().toInt()
    var is윤년 = false
    if(year % 4 == 0){
      if(year % 400 == 0 || year % 100 != 0){
          is윤년 = true
      }
    }

    if(is윤년) bw.write("1")
    else bw.write("0")
    bw.flush()
}
