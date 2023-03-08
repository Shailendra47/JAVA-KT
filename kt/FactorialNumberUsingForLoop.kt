fun main() {
    val num = 10
    var factorial: Long = 1
    for (i in 1..num){
        //factorial = factorial * i
        factorial *= i.toLong()
    }
    //10! = 10 × 9 × 8 × 7 × 6 × 5 × 4 × 3 × 2 × 1 = 3628800.
    println("Factorial of number : $num = $factorial")
}