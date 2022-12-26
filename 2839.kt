fun main() {
    val input = readln()

    var sugar = input.toInt()

    var carrier = 0
    while(sugar >= 0){
        if(sugar % 5 == 0){
            carrier += (sugar / 5)
            print(carrier)
            return
        }

        sugar -= 3
        carrier++
    }

    print(-1)
}
