fun main(){
    var s:String = "1234"
    var a:Int? = s as? Int;

    if(a != null){
        println("a is   Not null")
    }
    else {
        println("a is null")
    }
}