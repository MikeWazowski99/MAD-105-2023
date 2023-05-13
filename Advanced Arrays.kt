fun main() {
    val dimArray = arrayOf(
        "Cups", "Coffee", "Sugar", "Cream", "Caramel", "Ice Cream", "Vanilla", "Chocolate", "Tea",
        "Coffee Machine", "Matcha", "Hazelnut", "Pumpkin", "Cinnamon", "Peppermint"
    )
    val quant = arrayOf("35", "55", "15", "30", "10", "20", "10", "10", "1", "5", "7", "44", "21", "3", "5")

    println("Size: ${dimArray.size}")
    println("Elements: ${dimArray[5]}")

    for (singlePart in dimArray) {
        println(singlePart)
    }

        val combArray = arrayOf(dimArray, quant)

        val rowCount = combArray[0].size - 1

        for (i in 0..rowCount) {
            val item = combArray[0][i]
            var qty = combArray[1][i].toInt()

            println("Please enter the total amount you would like to add or subtract from the $item storage")
            println("In the storage: $item has $qty items.")

            val qtyToAdd = readLine()?.toIntOrNull() ?: 0
            qty += qtyToAdd
            qty = qty.coerceAtLeast(0)

            println("New quantity for $item: $qty\n")
        }
    }
}
