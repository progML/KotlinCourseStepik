package Collections

fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.map { customer ->
        customer.orders.flatMap { it.products }.toSet()
    }.reduce { a, setOfProducts ->
        a.intersect(setOfProducts)
    }
}







