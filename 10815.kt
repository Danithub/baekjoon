import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val numberCards = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val checkCards = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for (i:Int in checkCards.indices){
        sb.append("${binarySearch(numberCards, checkCards[i])} ")
    }

    bw.write(sb.toString())
    bw.flush()
}

fun binarySearch(arr:List<Int>, number: Int):Int {
    var low = 0
    var high = arr.size - 1
    var mid = 0

    while (low <= high){
        mid = (low + high) / 2

        if(number == arr[mid]){
            return 1
        } else if (number < arr[mid]){
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return 0
}
