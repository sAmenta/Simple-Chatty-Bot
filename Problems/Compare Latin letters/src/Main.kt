import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val stringChar = scanner.nextLine()
    val latinChar1 = stringChar.first().toLowerCase()
    val latinChar2 = stringChar.last().toLowerCase()

    print(latinChar1 == latinChar2)
}