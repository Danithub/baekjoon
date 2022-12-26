fun main() {
    val count = readln().toInt()

    var result = ""
    for (i: Int in 0 until count){
        val even = readln().toInt()

        // n/2을 기준으로 +1/-1을 하며 두 수가 소수이고 합이 n인 값을 찾는다.
        var lowNumber = even / 2
        var highNumber = even / 2
        while (true){
            if(isPrime(lowNumber) && isPrime(highNumber)){
                if(lowNumber + highNumber == even){
                    result += "$lowNumber $highNumber\n"
                    break;
                }
            }
            lowNumber--
            highNumber++
        }
    }
    print(result)
}

fun isPrime(n: Int): Boolean{
    var i = 2

    while(i*i <= n){
        if(n % i++ == 0) return false
    }

    return true
}
