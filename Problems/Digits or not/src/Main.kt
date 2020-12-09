import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char1 = scanner.next().first().isDigit()
    val char2 = scanner.next().first().isDigit()
    val char3 = scanner.next().first().isDigit()
    val char4 = scanner.next().first().isDigit()

    print(char1)
    print('\\')
    print(char2)
    print('\\')
    print(char3)
    print('\\')
    print(char4)
}