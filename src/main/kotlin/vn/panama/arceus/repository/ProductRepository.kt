package vn.panama.arceus.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import vn.panama.arceus.model.Product

@Repository
interface ProductRepository : CrudRepository<Product, Long>