fun splitBill(amount: Double, tipPercent: Int, people: Int): Double {
val tip = amount * tipPercent / 100
val total = amount + tip
val human = total / people
 return human
}

fun main(){
    val human = splitBill(42357.0,10,3)
    println(" каждый платит:$human")
    
}

   


