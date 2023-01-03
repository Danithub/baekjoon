import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val numberCards = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val m = br.readLine().toInt()
    val checkCards = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for (i:Int in checkCards.indices){
        if(numberCards.add(checkCards[i])){
            sb.append("0 ")
        } else{
            sb.append("1 ")
        }
    }

    bw.write(sb.toString())
    bw.flush()
}
