import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    if (-15 < num && num <= 12 || 14 < num && num < 17 || num >= 19) {
        print("True")
    } else {
        print("False")
    }
}