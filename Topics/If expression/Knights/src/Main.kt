import java.util.Scanner
import kotlin.math.*

fun main() {
    val input = Scanner(System.`in`)
    val x1 = input.nextInt()
    val y1 = input.nextInt()
    val x2 = input.nextInt()
    val y2 = input.nextInt()
    if ((abs(y2 - y1) == 1 && abs(x2 - x1) == 2) || (abs(y2 - y1) == 2 && abs(x2 - x1) == 1)){
        println("YES")
    }
    else{
        println("NO")
    }

}


//    y2 - y1 = 1 and x2 - x1 = 2 or y2 - y1 = 2 and x2 - x1 = 1
