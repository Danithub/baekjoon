import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    val A = br.readLine().split(" ").map { it.toInt() }.toSet()
    val B = br.readLine().split(" ").map { it.toInt() }.toSet()

    val gong = mutableSetOf<Int>()
    gong.addAll(A)
    gong.addAll(B) //A, B의 공집합

    val rest = A.size + B.size - gong.size //공집합을 제외한 수
    val cnt = A.size + B.size - (rest * 2)


    bw.write("$cnt")
    bw.flush()
}
