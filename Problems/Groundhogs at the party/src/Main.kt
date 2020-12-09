import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeseCups = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()

    print(isWeekend && reeseCups >= 15 && reeseCups <= 25 || isWeekend == false && reeseCups >= 10 && reeseCups <= 20)
}