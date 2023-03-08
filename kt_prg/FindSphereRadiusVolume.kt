import java.util.*
import kotlin.math.pow

fun main() {
    //Input Stream
    val scanner = Scanner(System.`in`)
    //Input Radius
    print("Enter the radius of sphere : ")
    val radius = scanner.nextDouble()
    //formula volume = (4/3) * pi * radius^3
    val volume = (4.0/3.0) * Math.PI * radius.pow(3)
    println("The volume of the sphere with radius : $radius is $volume")
}