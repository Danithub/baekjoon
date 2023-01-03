import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val cards = br.readLine().split(" ").map { it.toInt() }
    val cardMap = mutableMapOf<Int, Int>()
    cards.forEach {
        if(cardMap.contains(it)){
            cardMap.put(it, cardMap[it]!! +1)
        } else{
            cardMap.put(it, 1)
        }
    }

    val m = br.readLine().toInt()
    val checks = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    checks.forEach {
        if(cardMap.contains(it)){
            sb.append("${cardMap[it]} ")
        } else{
            sb.append("0 ")
        }
    }

    bw.write(sb.toString())
    bw.flush()
}
