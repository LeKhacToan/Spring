package vn.panama.arceus.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import vn.panama.arceus.repository.ProductRepository
import org.springframework.stereotype.Component
import vn.panama.arceus.model.Product

@Component
class ProductQueryResolve(val productRepository: ProductRepository) : GraphQLQueryResolver {
    fun products() : List<Product> {
        val products = productRepository.findAll() as (List<Product>)
        return products
    }
}