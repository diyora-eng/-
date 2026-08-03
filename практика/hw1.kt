fun  taxiCost(distance: Double,pricePerKm: Double,startPrice: Double ): Double{
    val price=distance*pricePerKm
    val total=price+startPrice
   return total
}

fun main(){
println(taxiCost(12.0,150.0,500.0))
}
