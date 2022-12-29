import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n){
        val word = br.readLine()
        //bw.write("$word : ${isPalindrome(word).first} ${isPalindrome(word).second}\n")
        bw.write("${isPalindrome(word).first} ${isPalindrome(word).second}\n")
    }
    bw.flush()
}

fun recursion(s: String, l: Int, r: Int, cnt: Int): Pair<Int, Int> {
    val nextCnt = cnt + 1
    return if (l >= r) Pair(1, nextCnt) else if (s[l] != s[r]) Pair(0, nextCnt) else recursion(s, l + 1, r - 1, nextCnt)
}

fun isPalindrome(s: String): Pair<Int, Int> {
    return recursion(s, 0, s.length - 1, 0)
}
