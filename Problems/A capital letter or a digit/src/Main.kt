import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val readChar = scanner.next().first()
    val isUpperChar = readChar.isUpperCase()
    val isDigit = readChar in '\u0031'..'\u0039'

    print(isUpperChar || isDigit)
}