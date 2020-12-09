import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var storeNum = 0
    do {
        val num = scanner.nextInt()
        if (num > storeNum) {
            storeNum = num
        }
    } while (num != 0)
    print(storeNum)
}