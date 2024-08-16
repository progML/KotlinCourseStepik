package Collections

//https://stepik.org/lesson/46379/step/1?unit=24415
// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxByOrNull { it.orders.count()}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products }.maxByOrNull { it.price }