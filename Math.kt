fun main() {
    val taxRate = 0.025 // 2.5% tax rate
    val tipRate = 0.175 // 17.5% tip rate
    var cost = 0.0

    print("Enter cost of item (enter 0 to finish): ")
    var input = readLine()?.toDoubleOrNull() ?: 0.0
    while (input != 0.0) {
        cost += input
        print("Enter cost of item (enter 0 to finish): ")
        input = readLine()?.toDoubleOrNull() ?: 0.0 
    }

    val tax = cost * taxRate
    val total = cost + tax
    val tip = total * tipRate

    println("Total cost: \$${"%.2f".format(cost)}")
    println("Taxes: \$${"%.2f".format(tax)}")
    println("Total with taxes: \$${"%.2f".format(total)}")
    println("Recommended tip (17.5%): \$${"%.2f".format(tip)}")
}
