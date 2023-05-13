import java.awt.Rectangle

fun Square(){
    var base = 0
    println("\nPlease enter the length of the shape: ")
    base = readLine()!!.toInt()
    val ans = base * base
    println("The are of the square is: $ans")
}

fun Triangle(){
    var base = 0
    var height = 0
    println("Please enter the base of your triangle: ")
    base = readLine()!!.toInt()
    println("Please enter the height of your triangle: ")
    height = readLine()!!.toInt()

    var ans: Float = ((base * height) / 2).toFloat()
    println("The area of your triangle is : $ans")
}

fun Shape(){
    var base = 0
    var height = 0
    println("Please enter the base of your rectangle: ")
    base = readLine()!!.toInt()
    println("Please enter the height of your rectangle: ")
    height = readLine()!!.toInt()

    var ans: Float = (base * height).toFloat()
    println("The area of your triangle is : $ans")
}

fun Circle(){
    var radius = 0
    println("Please enter the radius of your circle: ")
    radius = readLine()!!.toInt()

    var ans: Float = (3.14  * (radius * radius)).toFloat()
    println("The area of your triangle is : $ans")
}

fun main(){
    var userChoice1 = 0

    println("1.) Square")
    println("2.) Triangle")
    println("3.) Rectangle")
    println("4.) Circle")

    print("Please select the shape that you would like to find the area of: ")

    userChoice1 = readLine()!!.toInt()
    if (userChoice1 == 1)
        Square()
    else if (userChoice1 == 2)
        Triangle()
    else if (userChoice1 == 3)
        Shape()
    else if (userChoice1 == 4)
        Circle()
    else
        println("That is an invalid option please try again.")
}