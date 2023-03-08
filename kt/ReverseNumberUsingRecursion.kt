fun main() {
    val sentence = "Hello Kotlin!"
    val reversed = reverse(sentence)
    println("Reversed $sentence is : $reversed")
}
fun reverse(sentence: String): String {
    if (sentence.isEmpty()) return sentence
    return reverse(sentence.substring(1)) + sentence[0]
}