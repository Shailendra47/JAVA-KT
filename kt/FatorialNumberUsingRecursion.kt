fun main() {
    val num = 6
    val factorial = multiplyNumbers(num)
    println("Factorial of $num = $factorial")
}
fun multiplyNumbers(num: Int):Long {
    return if (num >= 1) num * multiplyNumbers(num - 1)
    else 1
}