import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = br.readLine()
        if (input == "-1 -1 -1") break
        val inputNumbers = input.split(" ").map { it.toInt() }

        val answer = w(inputNumbers[0], inputNumbers[1], inputNumbers[2])
        bw.write("w(${inputNumbers[0]}, ${inputNumbers[1]}, ${inputNumbers[2]}) = $answer\n")
    }

    bw.flush()
}

private val dp = Array(21) { Array(21) { Array(21) { 0 } } }
private fun w(a: Int, b: Int, c: Int): Int {
    if (a <= 0 || b <= 0 || c <= 0) {
        return 1
    }
    if (a > 20 || b > 20 || c > 20) {
        return w(20, 20, 20)
    }

    if (dp[a][b][c] != 0) return dp[a][b][c]

    if (a < b && b < c) {
        dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return dp[a][b][c]
    }

    if (dp[a][b][c] != 0) return dp[a][b][c]

    dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
    return dp[a][b][c]
}
