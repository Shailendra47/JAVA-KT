fun main() {
    val num = 10
    var i = 1
    var factorial: Long = 1
    while (i <= num){
        factorial *= i.toLong()
        i++
    }
    println("Factorial of number : $num = $factorial")
}