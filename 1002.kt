import java.awt.Point
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cnt = br.readLine().toInt()

    for (i:Int in 0 until cnt){
        val pointList = br.readLine().split(" ").map { it.toInt() }
        val p1 = Point(pointList[0], pointList[1])
        var r1 = pointList[2]
        val p2 = Point(pointList[3], pointList[4])
        var r2 = pointList[5]

        // d = 두 원의 중심의 거리
        // r = 작은 원의 반지름
        // r2 = 큰 원의 반지름
        val d = (p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y)
        if(r1 > r2){
            val tempRadius = r1
            r1 = r2
            r2 = tempRadius
        }
        val rm = (r2 - r1)*(r2 - r1)
        val rp = (r2 + r1)*(r2 + r1)

        // 완전히 겹치는 경우
        if (p1.x == p2.x && p1.y == p2.y && r1 == r2){
            bw.write("-1\n")
        }
        // 두 점으로 겹칠 경우
        // r2 - r1 < d < r1 + r2
        else if((rm < d) && (d < rp)){
            bw.write("2\n")
        }
        // 한 점에서 만나는 경우, 내접, 외접
        // r1 + r2 = d (외접), r2 - r1 = d (내접)
        else if(rp == d || rm == d){
            bw.write("1\n")
        }
        // 만나지 않을 경우
        // r1 + r2 < d (완전히 떨어져 있는 경우)
        // d < r2 - r1 (작은 원이 큰 원 안에 있는 경우)a
        // d == 0 && r1 != r2 (동심원)
        else if(rp < d || d < rm || (d == 0 && r1 != r2)){
            bw.write("0\n")
        }
    }
    bw.flush()
}
