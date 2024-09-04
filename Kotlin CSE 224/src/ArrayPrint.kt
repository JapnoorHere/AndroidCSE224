fun main() {
//    var arr = listOf("A","B","C","D",4);
//
//    for(i in arr){
//        println(i)
//    }

    var arr = arrayOf("Hello","Hi",123);

    for(i in arr.indices){
        println("Element at $i is ${arr[i]}");
    }

}