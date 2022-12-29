import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    //val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    if(n < 2) {
        print(n)
        return
    }
    print(Fibonacci(n, 2, 0, 1))
}

fun Fibonacci(n: Int, index: Int, i: Int, j: Int): Int{
    if(n == index){
        return i + j
    }

    val nextIndex = index + 1
    return Fibonacci(n, nextIndex, j, i + j)
}
