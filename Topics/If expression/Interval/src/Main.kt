fun main() {
    val number = readln().toInt()
    val a =(-15 < number && number <= 12) || (14 < number && number < 17) || (number >= 19)
    if (a){
        println("True")
    }
    else{
        println("False")
    }

}