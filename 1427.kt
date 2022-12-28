fun main() {
    val number = readln()

    val arr = IntArray(10)
    number.map { arr[it.digitToInt()] ++ }

    for (i:Int in arr.size - 1 downTo 0){
        print("$i".repeat(arr[i]))
    }
}
