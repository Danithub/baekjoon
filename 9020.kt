class Candidate(min: Int, max: Int) {
    var min = 0
    var max = 0
    var distance = 0

    init {
        this.min = min
        this.max = max
        this.distance = max - min
    }
}

fun main() {
    val count = readln().toInt()

    var result = ""
    for (i: Int in 0 until count){
        val even = readln().toInt()

        val primeList = mutableListOf<Int>()
        for (j: Int in 2 until even){
            if(isPrime(j)) primeList.add(j)
        }

        var candidateList = mutableListOf<Candidate>()
        for (m:Int in 0 until primeList.size){
            if(primeList.contains(even - primeList[m]) && primeList[m] <= even - primeList[m]){
                val can = Candidate(primeList[m], even - primeList[m])
                //println("min : ${can.min}, max : ${can.max}")
                candidateList.add(can)
            }
        }

        candidateList = candidateList.sortedBy { it.distance }.toMutableList()

        result += "${candidateList.first().min} ${candidateList.first().max}\n"
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
