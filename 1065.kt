fun main() {
    val input = readln()

    var countOfHansoo = 0
    for (i:Int in 1 .. input.toInt() ){
        if(isHansoo(i.toString()))
            countOfHansoo++
    }
    print(countOfHansoo)
}

fun isHansoo(number: String): Boolean{
    if(number.toInt() < 100) return true

    val arr = number.map {
        it.code
    }
    return (arr[2] - arr[1]) == (arr[1] - arr[0])

}
