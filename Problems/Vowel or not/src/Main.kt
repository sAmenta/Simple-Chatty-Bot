import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0].toLowerCase()

    println(isVowel(letter))
}

fun isVowel(v: Char): Boolean {
    val vowels = "aeiou"
    return v in vowels
}