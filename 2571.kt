import java.lang.StringBuilder
import java.util.PriorityQueue

fun main() {
    val count = readln().toInt()

    val pq = PriorityQueue<Int>()
    for (i:Int in 0 until count){
        pq.add(readln().toInt())
    }

    val sb = StringBuilder()
    for (i:Int in 0 until pq.size){
        sb.append("${pq.poll()}\n")
    }

    print(sb.toString())
}
