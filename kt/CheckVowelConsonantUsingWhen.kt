fun main() {
    var ch: Char = 'h'
    //When is Switch statement in Kotlin.
    when (ch){
        'a', 'e', 'i', 'o', 'u' -> println("$ch is Vowel")
        else -> println("$ch is a Consonant")
    }
}