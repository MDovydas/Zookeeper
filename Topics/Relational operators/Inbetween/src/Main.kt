fun main() {
    val x = readln().toInt()
    val first = readln().toInt()
    val second = readln().toInt()
    println((x in first..second) || (x in second..first))
}
