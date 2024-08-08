package Introduction

fun main() {
    val test = listOf(2, 3, 5)
    println(containsEven(test))
}

fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    it % 2 == 0
}




