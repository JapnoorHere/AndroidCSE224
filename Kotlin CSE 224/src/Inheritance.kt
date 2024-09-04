open class Rectangle(var a: Double, var b: Double) {
    fun area(): Double {
        return a * b;
    }

    open fun display() {
        println("Area of rectangle $a and $b is ${area()}")
    }

}

class Square(var s:Double):Rectangle(s,s){
    override fun display() {
        println("Area of square $s is ${area()}")
    }
}

fun main() {
    var s = Square(100.0)
    s.display()
}

//hw -> recursion to find the factorial of the number
//hw - area of circle