import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var hours = nextInt()
    var minutes = nextInt()
    val time = nextInt()

    if (minutes + time >= 60) {
        if (hours + ((minutes + time) / 60) >= 24) {
            hours = hours + ((minutes + time) / 60) - 24 * ((hours + ((minutes + time)) / 60) / 24)
        } else {
            hours = hours + ((minutes + time) / 60)
        }
        minutes = minutes + time - 60 * ((minutes + time) / 60)
    } else {
        minutes = minutes + time
    }

    print("$hours $minutes")
}
