fun main() {
    val n = readln().toInt()
    if (n < 10) {
        print(0)
    } else {
        val ten = n % 100 / 10
        print(ten)
    }
}