import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var list = mutableListOf<String>()

    for (i:Int in 0 until n){
        list.add(br.readLine())
    }

    list = list.distinct().toMutableList()
    list.sortWith(Comparator { o1, o2 -> if(o1.length == o2.length){
            o1.compareTo(o2)
        }else{
            o1.length - o2.length
        }
    })

    list.forEach { bw.write("${it}\n") }
    bw.flush()
}
