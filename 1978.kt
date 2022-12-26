fun main() {
    val input = readln()

    var cnt = 0
    val numbers = readln().split(' ').map { it.toInt() }
    for (j: Int in numbers.indices){
        if(numbers[j] == 1)continue
        if(isPrime(numbers[j])){
            cnt++
        }
    }

    print(cnt)
}

fun isPrime(n: Int): Boolean{
    var i = 2

    while (i * i <= n){
        if(n % i++ == 0) return false
    }

    return true
}
