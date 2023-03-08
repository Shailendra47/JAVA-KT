import java.math.BigInteger

fun main() {
    val num = 30
    var factorial = BigInteger.ONE
    for (i in 1..num){
        //factorial = factorial * i
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("Factorial of number : $num = $factorial")
}