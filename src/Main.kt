import java.util.*

fun main() {
    val c = Calendar.getInstance()

    c.set(Calendar.YEAR, 2021)

    val monthName: String = c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault())
    val hourName = c.get(Calendar.HOUR_OF_DAY)
    val minuteName = c.getDisplayName(Calendar.MINUTE, Calendar.SHORT_FORMAT, Locale.getDefault())
    val monthNameMod: String = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.TRADITIONAL_CHINESE)
    val year = c.get(Calendar.YEAR)

    println(hourName)
    println(minuteName)
    println(year)
    println(monthName)
    println(monthNameMod)
}