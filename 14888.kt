import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max
import kotlin.math.min

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val operators = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    calculator(n, numbers[0], 1, numbers, operators)

    bw.write("$max\n$min")
    bw.flush()
}

private var max = -1_000_000_000
private var min = 1_000_000_000
private fun calculator(cnt: Int, num: Int, idx: Int, nums:IntArray, ops: IntArray){
    if(idx == cnt){
        max = max(max, num)
        min = min(min, num)
    }

    for (i in ops.indices){
        if(ops[i] != 0){
            ops[i]--
            when(i){
                0 -> calculator(cnt, num + nums[idx], idx + 1, nums, ops)
                1 -> calculator(cnt, num - nums[idx], idx + 1, nums, ops)
                2 -> calculator(cnt, num * nums[idx], idx + 1, nums, ops)
                3 -> calculator(cnt, num / nums[idx], idx + 1, nums, ops)
            }
            ops[i]++
        }
    }
}
