fun main() {

    val alphabetsInNumber = mapOf(
        1 to "",            // n + 2초
        2 to "ABC",
        3 to "DEF",
        4 to "GHI",
        5 to "JKL",
        6 to "MNO",
        7 to "PQRS",
        8 to "TUV",
        9 to "WXYZ",
        0 to "OPERATOR"
    )

    val input = readln()
    val alphabets = input.map{ it }

    var sum = 0
    for (i:Int in 0 until alphabets.count()){
        sum += getKey(alphabetsInNumber, alphabets[i])!!.toInt() + 1
        //println("alphabet : ${alphabets[i]}, sum : ${sum} ")
    }

    print(sum)
}

fun getKey(map: Map<Int, String>, target: Char): Int?{
    for ((key, value) in map){
        if(value.contains(target)){
            return key;
        }
    }
    return null
}
