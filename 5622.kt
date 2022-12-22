fun main() {
    val input = readln()
    val alphabets = input.map{ it }

    var sum = 0
    for (i:Int in 0 until alphabets.count()){
        sum += getTime(alphabets[i])
    }

    print(sum)
}

fun getTime(alphabet: Char): Int{
    return when(alphabet){
        in 'A'..'C' -> 3
        in 'D' .. 'F' -> 4
        in 'G' .. 'I' -> 5
        in 'J' .. 'L' -> 6
        in 'M' .. 'O' -> 7
        in 'P' .. 'S' -> 8
        in 'T' .. 'V' -> 9
        else -> 10
    }
}
