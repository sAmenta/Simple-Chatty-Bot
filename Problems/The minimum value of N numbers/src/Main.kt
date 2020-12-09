import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var result = 0

    repeat(n) {
        val num = scanner.nextInt()
        if (num < result) {
            result = num
        }
    }
    print(result)
}