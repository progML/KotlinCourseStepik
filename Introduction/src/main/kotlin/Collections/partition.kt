package Collections

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    val (date, _) = customers.partition { customer ->
        val undelivered = customer.orders.count { !it.isDelivered }
        val delivered = customer.orders.count { it.isDelivered }
        undelivered > delivered
     }
    return date.toSet()
}