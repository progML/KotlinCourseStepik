package Collections
//https://stepik.org/lesson/46380/step/1?unit=24416
// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.count() }