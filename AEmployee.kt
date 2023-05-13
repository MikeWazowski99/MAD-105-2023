import java.text.DecimalFormat

class Employee1(
    val name: String, val position: PositionTitle, val Salaray: Boolean,
    val payRate: Double, val shift: Int
) {
    fun calculate(hoursIn: Double): Double {
        var baseHours = hoursIn
        var overtimeHours = 0.0

        // Apply shift differentials
        val shiftFactor = when (shift) {
            2 -> 1.05
            3 -> 1.1
            else -> 1.0
        }
        var payRateAdjusted = payRate * shiftFactor

        // Apply overtime for non-salary employees
        if (!Salaray && baseHours > 40) {
            overtimeHours = baseHours - 40
            baseHours = 40.0
            payRateAdjusted *= 1.5
        }

        // Calculate weekly pay
        val weeklyPay = baseHours * payRateAdjusted + overtimeHours * payRateAdjusted

        // Format numbers for display
        val formatter = DecimalFormat("#,##0.00")
        val formattedPayRate = formatter.format(payRateAdjusted)
        val formattedHoursIn = formatter.format(hoursIn)
        val formattedWeeklyPay = formatter.format(weeklyPay)

        // Print weekly pay
        println("$name, $position, $$formattedPayRate/hour, worked $formattedHoursIn hours this week, earned $$formattedWeeklyPay")


        return weeklyPay
    }
}

fun main() {
    val employee1 = Employee1("John Smith", PositionTitle.Production, false, 15.0, 2)
    employee1.calculate(50.0)

    val employee2 = Employee1("Jane Doe", PositionTitle.Administration, true, 50000.0, 1)
    employee2.calculate(40.0)
}
