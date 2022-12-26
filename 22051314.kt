fun main() {
    var N = readln().toInt()

    var number = 2
    while(N > 1){
        if(N % number == 0){
            println(number)
            N /= number
        } else{
            number++
        }
    }
}

