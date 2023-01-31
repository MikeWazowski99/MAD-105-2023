fun main(){
    var userChoice = 0


    do {
        println("\nPlease enter the number of your selection")
        println("1) Laptop")
        println("2) Computer")
        println("3) Monitor")
        println("4) Keyboard")
        println("5) Desk")
        println("6) Speakers")
        println("7) Exit")

        print("Please enter an option: ")
        userChoice = readLine()!!.toInt()


        println("You have selected: $userChoice")

        if (userChoice > 7)
            println("You have selected an invalid entry, please try again")
        else if (userChoice == 6)
            println("Speakers\n")
        else if (userChoice == 5)
            println("Desk\n")
        else if (userChoice == 4)
            println("Keyboard\n")
        else if (userChoice == 3)
            println("Monitor\n")
        else if (userChoice == 2)
            println("Computer\n")
        else if (userChoice == 1)
            println("Laptop\n")
        else if (userChoice < 1)
            println("You have selected an invalid entry, please try again")

    } while(userChoice != 7)

}