package one.`digitalinnovation-collections`

fun main() {
    val values = intArrayOf(6, 3, 5, 1, 8, 2)

    values.forEach {
        println(it)
    }

    println("----------------")

    values.sort()
    values.forEach {
        println(it)
    }
}