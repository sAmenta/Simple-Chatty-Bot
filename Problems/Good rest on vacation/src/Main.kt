import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()

    val totalCost = foodCost * days + flightCost * 2 + hotelCost * (days - 1)
    print(totalCost)
}