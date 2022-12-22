fun main() {
    var selfNumbers = mutableListOf<Int>()

    for(i: Int in 1 until 10000){
        selfNumbers.add(d(i))

        if(selfNumbers.contains(i)) continue;

        println(i)
    }
}

fun d(number: Int): Int{
    return number + (number % 10) + ((number % 100) / 10) + ((number % 1000) / 100) + ((number % 10000) / 1000) 
}
