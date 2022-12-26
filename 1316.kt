fun main() {
    val input = readln()

    var cnt = 0
    for (i: Int in 0 until input.toInt()){
        val charsInWord = mutableListOf<Char>()

        val word = readln()
        var isGroupWord = true
        for (j: Int in word.indices){
            if(charsInWord.isNotEmpty() && charsInWord.last() == word[j]){
                //연속적으로 나온 단어는 리스트에 추가하지 않는다.
                //println("${word[j]} is passed")
                continue
            }
            if(charsInWord.contains(word[j])) {
                //리스트에 이미 나온 단어가 또 나온 경우 break
                //println("${word[j]} is again")
                isGroupWord = false
                break
            }

            charsInWord.add(word[j])
            //println(charsInWord)
        }

        if(isGroupWord) cnt++
    }

    print(cnt)
}
