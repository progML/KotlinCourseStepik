package Collections

//https://stepik.org/lesson/46378/step/1?unit=24414


data class Product(val name: String, val price: Double)


// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap {
    it.products
}.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> {
    return customers.flatMap { it.getOrderedProducts() }.toSet()
}