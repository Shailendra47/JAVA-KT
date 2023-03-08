fun main() {
    val num: Int = 27
    var result = false
    for (i in 2..num / 2) {
        // condition for non-prime number
        if (num % i == 0) {
            result = true
            break
        }
    }
    if (!result)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}