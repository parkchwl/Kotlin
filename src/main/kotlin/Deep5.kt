fun main() {
    val word = readLine()!!.toString()
    val map = mutableMapOf<Char, Int>()

    word.forEach {
        val character = it.toLowerCase()

        if (map.containsKey(character)) {
            map[character] = map[character]!!.plus(1)
        } else {
            map.set(character, 1)
        }
    }

    val max = map.maxBy { it.value }
    if (map.filter { it.value == max!!.value }.count() > 1) {
        print("?")
    } else {
        print(max!!.key.toUpperCase())
    }
}