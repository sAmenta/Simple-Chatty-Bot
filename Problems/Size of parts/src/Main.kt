import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sumReady = 0
    var sumBroken = 0
    var sumRejected = 0

    repeat(n) {
        val part = scanner.nextInt()
        if (part == 1) {
            sumBroken++
        } else if (part < 0) {
            sumRejected++
        } else {
            sumReady++
        }
    }
    print(sumReady.toString() + " ")
    print(sumBroken.toString() + " ")
    print(sumRejected)
}