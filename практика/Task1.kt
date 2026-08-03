fun main(){
val list = listOf(1, 2, 3, 4, 5)
val reversedList = mutableListOf<Int>()
for (i in list.size - 1 downTo 0) {
    reversedList.add(list[i])
}

println(reversedList)
}