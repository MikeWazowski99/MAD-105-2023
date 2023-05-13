fun main(args: Array<String>) {


    val person1 = Employee(1, "Barney", "Rubble", 1,
        "815-555-1234", "815-555-1111", "815-555-2222")
    val person2 = Employee(2, "Fred", "Flinstone", 2,
        "815-555-3334", "815-555-3111", "815-555-5552")
    val person3 = Employee(3, "Fred", "Flinstone", 3,
        "815-555-3334", "815-555-3111", "815-555-5552")

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()

}
