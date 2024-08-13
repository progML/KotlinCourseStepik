package Collections

data class Order(val products: List<Product>, val isDelivered: Boolean)
data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>)

data class City(val name: String)

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return customers.map { it.city }.toSet()
}

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> {
   return customers.filter { it.city == city }.toList()
}