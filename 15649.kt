import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var n = 0
var m = 0
val numbers = IntArray(10)
val isUsed = BooleanArray(10)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    //val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (input1, input2) = br.readLine().split(" ").map { it.toInt() }
    n = input1
    m = input2

    backTracking(0)
}

fun backTracking(num: Int){
    if(num == m){
        for (i:Int in 0 until m){
            print("${numbers[i]} ")
        }
        println()
        return
    }

    for(i:Int in 1 .. n){
        if(!isUsed[i]){
            numbers[num] = i
            isUsed[i] = true
            backTracking(num + 1)
            isUsed[i] = false
        }
    }
}
