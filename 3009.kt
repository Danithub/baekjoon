import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (firX, firY) = br.readLine().split(" ").map { it.toInt() }
    val (secX, secY) = br.readLine().split(" ").map { it.toInt() }
    val (thirX, thirY) = br.readLine().split(" ").map { it.toInt() }

    val listX = IntArray(1_001)
    listX[firX] += 1
    listX[secX] += 1
    listX[thirX] += 1

    val listY = IntArray(1_001)
    listY[firY] += 1
    listY[secY] += 1
    listY[thirY] += 1

    for (i:Int in listX.indices){
        if(listX[i] == 1)
            bw.write("$i ")
    }

    for (i:Int in listY.indices){
        if(listY[i] == 1)
            bw.write("$i")
    }

    bw.flush()
}
