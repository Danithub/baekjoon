fun main() {
    val start = readln().toInt()
    val end = readln().toInt()

    var primes = mutableListOf<Int>()
    for (i:Int in start .. end){
        if(i == 1) continue
        if(isPrime(i)){
            primes.add(i)
        }
    }

    if(primes.isEmpty()) {
        print(-1)
        return
    }

    println(primes.sum()) //sum
    println(primes[0]) //min
}

fun isPrime(n: Int): Boolean{
    var i = 2

    while (i * i <= n){
        if(n % i++ == 0) return false
    }

    return true
}
