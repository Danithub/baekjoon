fun main() {
    var numbers = readln().split(' ').map { it.toInt() }

    for (i:Int in numbers[0] .. numbers[1]){
        if(i == 1)continue
        if(isPrime(i)) println(i)
    }
}

fun isPrime(n: Int): Boolean{
    var i = 2

    while(i*i <= n){
        if(n % i++ == 0) return false
    }

    return true
}
