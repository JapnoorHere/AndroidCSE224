//Secondary constructors
class IntroContructors(var name: String, var age:Int) {
//    var name: String
//    var age: Int
//
//    constructor(name:String, age:Int){
//        this.name = name;
//        this.age = age;
//    }

    constructor(x:String) : this() {
        this.name = x
        this.age = 0
    }
//
    constructor():this("Rahul",34);

//    constructor(){
//        this.name = "abc"
//        this.age = 30
//    }

    fun intro(){
        println("My name is $name and age is $age");
    }
}

fun main() {
//    println("Enter name: ")
//    var name = readln();
//    println("Enter age: ")
//    var age = readln().toInt()
//    var intro1 = IntroContructors(name,age);
//    intro1.intro()

    var intro2 = IntroContructors("Japnoor");
    intro2.intro()

//    var intro3 = IntroContructors();
//    intro3.intro()


}