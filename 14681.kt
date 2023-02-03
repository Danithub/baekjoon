import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val y = br.readLine().toInt()

    var vertical = false
    var horizontal = false

    if(x > 0) horizontal = true
    if(y > 0) vertical = true

    if(horizontal && vertical) bw.write("1")
    else if (!horizontal && vertical) bw.write("2")
    else if (!horizontal && !vertical) bw.write("3")
    else bw.write("4")

    bw.flush()
}
