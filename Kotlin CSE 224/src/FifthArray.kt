fun main() {
    val numbers = arrayOf(1,2,3,4,5);

    numbers[2] = 30;

    var size = numbers.size;
    if(numbers.isEmpty()){
        println("Numbers is empty")
    }
    else{
        for (i in numbers){
            println("$i ");
        }

        println("First element ${numbers.first()}")
        println("Last element ${numbers.last()}")
        println("Index of 30  is ${numbers.indexOf(30)}")
    }

    //multi dim array
    var multi = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9));


}

/*to determin eligibility for a special offer based on the total amount and membership status

define two variables
total amount of purchase
whether the customer has a membership or not

if total amount of purchase > 1000
 then check membership status -> if its true 20%
                                    else 10%

  if not member 
 */