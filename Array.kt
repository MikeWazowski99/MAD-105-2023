fun main(){
    val dimArray = arrayOf("Cups","Coffee","Sugar","Cream","Caramel","Ice Cream","Vanilla","Chocolate","Tea","Coffee Machine","Matcha","Hazelnut","Pumpkin","Cinnamon","Peppermint")

    print("Size: ${dimArray.size}")
    print("  ")
    println("Elements: ${dimArray[5]}")

    for (singlePart in dimArray) {
        println("${singlePart}")
    }
}