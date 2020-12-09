import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val phrase = scanner.nextLine()
    val position = scanner.nextInt()

    print("Symbol # $position of the string \"$phrase\" is \'${phrase[position - 1]}\'")
}