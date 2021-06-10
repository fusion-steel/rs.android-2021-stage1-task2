package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    /**
     * This method converts date representation given in Strings (day, month, year)
     * to format dd MMMM, EEEE (e.g. 15 3 2020 to 15 марта, воскресенье)
     */
    fun toTextDay(day: String, month: String, year: String): String {
        val date = GregorianCalendar(year.toInt(), month.toInt() - 1, day.toInt())
        date.isLenient = false
        val formatter = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))
        return try {
            formatter.format(date.time).also { println(it) }
        } catch (e: IllegalArgumentException) {
            "Такого дня не существует"
        }
    }
}