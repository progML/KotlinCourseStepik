package Collections

// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.map { it.products.map { it.price } }.sumByDouble { it.sum() }