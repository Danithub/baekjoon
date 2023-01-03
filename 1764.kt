import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.text.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    val list = mutableSetOf<String>()
    repeat(n){
        list.add(br.readLine())
    }

    val people = mutableListOf<String>()
    repeat(m){
        val person = br.readLine()
        if(!list.add(person)) people.add(person)
    }

    people.sort()
    val sb = StringBuilder()
    sb.append("${people.size}\n")
    repeat(people.size){
        sb.append("${people[it]}\n")
    }

    bw.write(sb.toString())
    bw.flush()
}
