fun main() {
    val year: Int = 1900
    var leap: Boolean = false
    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }
    println(if (leap) "$year is a leap year" else "$year is not a leap year")
}