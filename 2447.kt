import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val sb = StringBuilder()
    for (i:Int in 0 until n){
        for(j:Int in 0 until n){
            sb.append(star(n, i , j))
        }
        sb.append("\n")
    }
    bw.write(sb.toString())
    bw.flush()
}

fun star(n: Int, i: Int, j: Int): String{
    return if((i / n) % 3 == 1 && (j / n) % 3 == 1) " "
    else{
        if(n / 3 == 0) "*"
        else star(n/3, i , j)
    }
}
