import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val numberList = mutableListOf(1, 2, 3)
    val sum = sum(numberList)
    val result = setOf(2, 3) + setOf(3, 4)

}

fun a(numberList: MutableList<Int>) {
    numberList.add(4)
}

fun sum(numberList: List<Int>): Int {
    return numberList.sum()
}