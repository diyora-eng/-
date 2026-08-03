val grades = listOf(5, 3, 4, 2, 5, 5, 3)
val fivesCount = grades.count { it == 5 }
val belowThreeCount = grades.count { it < 3 }

fun main(){
println("Пятёрок: $fivesCount, ниже трёх: $belowThreeCount")
}