import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstName = scanner.next()[0]
    val lastName = scanner.next()
    val age = scanner.nextInt()

    print("$firstName. $lastName, $age years old")
}