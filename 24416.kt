import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var cnt1 = 0
    fun fib(n: Int): Int{
        if(n == 1 || n == 2){
            cnt1++
            return 1
        } else{
            return (fib(n - 1) + fib(n - 2))
        }
    }
    fib(n)

    var cnt2 = 0
    val arr = Array(n){0}
    fun fibonacci(arr: Array<Int>, n: Int): Int{
        arr[0] = 1
        arr[1] = 1
        for (i in 2 until n){
            cnt2++
            arr[i] = arr[i - 1] + arr[i - 2]
        }
        return arr[n-1]
    }
    fibonacci(arr, n)

    bw.write("$cnt1 $cnt2")
    bw.flush()
}
