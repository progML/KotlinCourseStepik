package Collections

data class City(val name: String)

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return customers.map { it.city }.toSet()
}

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> {
   return customers.filter { it.city == city }.toList()
}