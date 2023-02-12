import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val result = add(n)

    bw.write("$result")
    bw.flush()
}

private fun add(n: Int): Int{
    if(n == 1) return 1

    return n + add(n - 1)
}
