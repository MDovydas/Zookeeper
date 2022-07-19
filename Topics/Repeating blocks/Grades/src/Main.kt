fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        val numb = readln().toInt()
        if (numb == 2) {
            d += 1
        }
        if (numb == 3) {
            c += 1
        }
        if (numb == 4) {
            b += 1
        }
        if (numb == 5) {
            a += 1
        }
    }
    println("$d $c $b $a")
}