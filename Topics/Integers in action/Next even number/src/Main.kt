fun main() {
    val givenNumber = readln().toInt()
    var outNumber = 0
    if (givenNumber % 2 == 0) {
        outNumber = givenNumber + 2
    } else {
        outNumber = givenNumber + 1
    }
    print(outNumber)
}