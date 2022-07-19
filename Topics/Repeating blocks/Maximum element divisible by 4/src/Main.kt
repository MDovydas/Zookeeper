fun main() {
    val elements = readln().toInt()
    var biggest = 0
    repeat(elements) {
        var element = readln().toInt()
        if ((element / 4 > biggest / 4) && element % 4 == 0){
            biggest = element
        }
    }
    println("$biggest")
}