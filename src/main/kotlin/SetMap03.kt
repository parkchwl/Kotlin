import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val map = HashMap<String, String>()

    repeat(n) {
        val name = sc.next()
        val state = sc.next()

        if (map.containsKey(name)) {
            map.remove(name)
        } else {
            map[name] = state
        }
    }

    val list = ArrayList(map.keys)
    list.sortDescending()

    for (li in list) {
        print("$li ")
    }
}
