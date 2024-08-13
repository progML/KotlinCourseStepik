package Introduction

import java.util.*

//https://stepik.org/lesson/46356/step/1?unit=24394

fun getLists(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}