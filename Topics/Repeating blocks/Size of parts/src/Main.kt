fun main() {
    val n = readln().toInt()
    var larger = 0
    var perfect = 0
    var smaller = 0
    repeat(n){
        var out = readln().toInt()
        if (out == -1){
            smaller += 1
        }
        if (out == 0){
            perfect += 1
        }
        if (out == 1){
            larger += 1
        }
    }
    println("$perfect $larger $smaller")

}