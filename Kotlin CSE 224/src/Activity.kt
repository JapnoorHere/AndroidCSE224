fun main() {
    println("Enter amount: ")
    var amount:Int = readln().toInt()

    var member:Boolean = true
    if (amount >= 1000) {
        if (member) {
            println("discount: 20%")
        } else {
            println("discount: 10%")
        }
    } else {
        println("No discount")

    }

}
