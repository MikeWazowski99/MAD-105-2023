fun main(args: Array<String>) {
    var temperature: Float = 0.0F

    while (temperature != 999F){
        print("Enter a number between 1 and 100: ")
        temperature = readLine()!!.toFloat()
        if (temperature > 99.5)
            println("The temperature is hot")
        else if (temperature >= 97.5)
            println("The temperature is warm")
        else if (temperature < 97.5)
            println("The temperature is cold")
    }

}