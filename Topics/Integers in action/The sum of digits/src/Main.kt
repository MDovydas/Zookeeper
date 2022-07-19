fun main() {
    val number = readln().toInt()
    val HUNDREDS = 100
    val TENTHS = 10
    val firstDigit = number / HUNDREDS
    val secondDigit = number % HUNDREDS / TENTHS
    val thirdDigit = number % HUNDREDS % TENTHS
    val sumOfDigits = firstDigit + secondDigit + thirdDigit
    print(sumOfDigits)
}
