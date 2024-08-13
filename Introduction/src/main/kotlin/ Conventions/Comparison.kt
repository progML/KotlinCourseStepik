package ` Conventions`

//https://stepik.org/lesson/46366/step/1?thread=solutions&unit=24402

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return (this.year * 10000 + this.month * 100 + this.dayOfMonth) - (other.year * 10000 + other.month * 100 + other.dayOfMonth)
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2