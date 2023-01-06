import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val goguma = br.readLine().toInt()

    val lineList = mutableListOf<Pair<Int, Int>>()
    for(i:Int in 0..5){
        val (direction, length) = br.readLine().split(" ").map { it.toInt() }
        lineList.add(Pair(direction, length))
    }

    // 최대 길이를 가진 두 변의 index를 구한다.
    var maxWidth = Int.MIN_VALUE
    var maxHeight = Int.MIN_VALUE
    var maxWidthIndex = 0
    var maxHeightIndex = 0
    for (i:Int in lineList.indices){
        if(lineList[i].first == 1 || lineList[i].first == 2){
            if(lineList[i].second > maxWidth) {
                maxWidth = lineList[i].second
                maxWidthIndex = i
            }
        } else{
            if(lineList[i].second > maxHeight){
                maxHeight = lineList[i].second
                maxHeightIndex = i
            }
        }
    }

    var baseIndex = 0
    if ((maxWidthIndex == 5 && maxHeightIndex == 0)|| (maxWidthIndex == 0 && maxHeightIndex == 5)){
        baseIndex = 0
    }
    else if(maxWidthIndex > maxHeightIndex) {
        baseIndex = maxWidthIndex
    } else {
        baseIndex = maxHeightIndex
    }

    // 기준 인덱스+2, 기준 인덱스+3의 값이 빠진 사각형의 넓이이다.
    val line1 = lineList[(baseIndex + 2) % 6]
    val line2 = lineList[(baseIndex + 3) % 6]

    bw.write("${((maxWidth * maxHeight) - (line1.second * line2.second)) * goguma}")
    bw.flush()
}
