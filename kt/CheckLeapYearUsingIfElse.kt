fun main() {
    val year: Int = 2020
    var leap: Boolean = false
    if (year % 4 == 0){
        if (year % 100 == 0){
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        }
        else {
            leap = true
        }
    }
    else {
        leap = false
    }
    if (leap) {
        println("$year is a leap year")
    } else "$year is not a leap year"

}