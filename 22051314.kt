fun main() {
    var N = readln().toInt()

    aaa(N)
}

var number = 2
fun aaa(n: Int){
    if(n <= 1){
        return
    }
    if(n % number != 0) {
        number++
        aaa(n)
        return
    }

    println(number)
    aaa(n/number)
}
