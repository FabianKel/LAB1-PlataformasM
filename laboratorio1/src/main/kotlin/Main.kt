fun main(args: Array<String>) {
    val itemData = ItemData()
    val value1 = "Hola"
    val value2 = 5505
    val value3 = false
    val value4 = 12.32

    println(itemData.getType(value1))
    println(itemData.getInfo(value1))
    println(itemData.getType(value2))
    println(itemData.getInfo(value2))
    println(itemData.getType(value3))
    println(itemData.getInfo(value3))
    println(itemData.getType(value4))
    println(itemData.getInfo(value4))
}