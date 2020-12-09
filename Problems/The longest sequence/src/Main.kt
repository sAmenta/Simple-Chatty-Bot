import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var minValue = Int.MIN_VALUE
    var counter = 0
    var storeCounterOld = 0
    var storeCounterNew = 0

    repeat(n) {
        val num = scanner.nextInt()
        if (minValue <= num) {
            minValue = num
            counter++
            storeCounterOld = counter
        } else {
            if (storeCounterOld > storeCounterNew) {
                storeCounterNew = storeCounterOld
            }
        }
    }

    print(storeCounterNew)
}