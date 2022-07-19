fun main() {
    var maximum = readln().toInt()
    var biggest = 1
    var a = 1
    println("$a")
    while(a < maximum){
        if ((a*a > biggest) && (a*a <= maximum)){
            biggest = a*a
            println("$biggest")
        }
        a++

    }
}