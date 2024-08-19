package Properties

//https://stepik.org/lesson/46387/step/1?unit=24423
class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(propertyWithCounter) {
            counter++
            field = propertyWithCounter
        }
}