fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    var d = 0
    var e = 0
    var f = 0
    if (a > 0) {
        d = 1
    }
    if (b > 0) {
        e = 1
    }
    if (c > 0) {
        f = 1
    }
    if (d + e + f == 1) {
        print("true")
    }else{
        print("false")
    }
}