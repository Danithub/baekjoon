import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dices = br.readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(10)
    for (i in dices.indices){
        numbers[dices[i]]++
    }

    var number = 0
    if(numbers.indexOf(3) > -1){
        number = numbers.indexOf(3)
        bw.write("${10_000 + number * 1_000}")
    } else if (numbers.indexOf(2) > -1){
        number = numbers.indexOf(2)
        bw.write("${1_000 + number * 100}")
    } else {
        number = numbers.lastIndexOf(1)
        bw.write("${number * 100}")
    }
    bw.flush()
}
