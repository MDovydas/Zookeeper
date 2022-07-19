fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()
    print(firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber)
}