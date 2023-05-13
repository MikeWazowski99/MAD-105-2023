import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main(args: Array<String>) {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday")

    println("Enter the month in which a full moon will be in: ")
    var moonMonth: Int = readLine()!!.toInt()

    println("Enter the day the full moon will be on: ")
    var moonDay: Int = readLine()!!.toInt()

    var holdMoon: LocalDate = LocalDate.of(year,moonMonth,moonDay)


    println("${holdMoon.isBefore(today)}")
    if (holdMoon.isBefore(today)){
        println("$holdMoon")
        holdMoon = holdMoon.plusYears(1)
        println("$holdMoon")
    }

    val nextmoonDay = holdMoon.format(formatter)

    var daysTomoonDay = today.until(holdMoon, ChronoUnit.DAYS)

    if (daysTomoonDay.toInt() == 0){
        println("Today is the Full Moon!")
    } else {
        println("The next full month: $nextmoonDay and there are $daysTomoonDay until then!")
    }




}