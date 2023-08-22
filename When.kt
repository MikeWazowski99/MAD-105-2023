fun main(){
    print("Please enter an option: ")
    val number = readLine()!!.toInt()
    var numString = "x"

    when (number) {
        1 -> numString = "Uno"
        2 -> numString = "Deux"
        3 -> numString = "Tre"
        4 -> numString = "Cuatro"
        5 -> numString = "Cinq"
        6 -> numString = "Seis"
        7 -> numString = "Zeven"
        8 -> numString = "Otte"
        9 -> numString = "Nueve"
        10 -> numString = "Dies"
        !in 1..10 -> numString = "Out of range"
        else -> numString = "Unknown"
    }

    println("The number is $numString")
}