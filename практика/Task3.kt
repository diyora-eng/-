val words = listOf("кот", "собака", "ёж", "крокодил", "лев")
val longWords = words.filterTo(mutableListOf()) { it.length > 3 }

fun main(){
println(longWords)
}
