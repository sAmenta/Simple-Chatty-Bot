import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var i = 1
    var result = ""

    while (i <= n) {
        repeat(i) {
            result += "$i "
        }
        i++
    }
    print(result.substring(0 until n * 2))
}