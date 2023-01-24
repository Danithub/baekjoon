import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (a, k) = br.readLine().split(" ").map { it.toInt() }

    var cnt = 0
    while(a != k){
        if(k % 2 == 0 && k / 2 >= a){
            k/=2
        } else{
            k-=1
        }
        cnt++
    }

    bw.write("$cnt")
    bw.flush()
}
