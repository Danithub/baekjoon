import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    val A = br.readLine().split(" ").map { it.toInt() }.sorted()
    val B = br.readLine().split(" ").map { it.toInt() }.sorted()

    var cnt = 0
    repeat(n){
        if(!binarySearch(B, A[it])){
            cnt++
        }
    }

    repeat(m){
        if(!binarySearch(A, B[it])){
            cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
}

fun binarySearch(arr: List<Int>, number:Int):Boolean{
    var low = 0
    var high = arr.size - 1
    var mid = 0

    while (low <= high){
        mid = (low + high) / 2

        if(arr[mid] == number){
            return true
        } else if (arr[mid] > number){
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return false
}
