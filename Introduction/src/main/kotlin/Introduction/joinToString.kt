package Introduction

//https://stepik.org/lesson/46347/step/1?unit=24386
fun joinOptions(options: Collection<String>) = options.joinToString(", ", "[", "]",)


fun main() {
    val coll = listOf("a", "b", "c")
    println(
    joinOptions(coll)
    )
}

