//fun display(){
//    println("My name is Japnoor Singh")
//}

//fun add(a:Int=5,b:Int=5){
//    println("The sum of $a and $b is ${a+b}")
//}
//
//fun sub(a:Int,b:Int){
//    println("The difference of $a and $b is ${a-b}")
//}


fun celsiusToFahrenheit(c:Double):Double{
    var res:Double = c * 9.0
    res /= 5
    return (res + 32)
}

fun fahrenheitToCelsius(f:Double):Double{
    var res:Double = f - 32.0
    res *= 5
    return (res/9)
}


fun main() {
//    display()

    println("Celsius to Fahrenheit: " + celsiusToFahrenheit(72.0));
    println("Fahrenheit to Celsius: " + fahrenheitToCelsius(161.6));

}