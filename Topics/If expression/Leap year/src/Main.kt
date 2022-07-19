fun main(args: Array<String>) {

    val year = readln().toInt()
    var leap = "Regular"

    if (year % 4 == 0){
        if (year % 100 == 0){
            if (year % 400 == 0){
                leap = "Leap"
            }
        }
        else {
            leap = "Leap"
        }
    }

    println(leap)
}