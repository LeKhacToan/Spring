package vn.panama.arceus.model

import javax.persistence.*


@Entity(name= "products")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null
    private var name: String? = null
    private var description: String? = null

    protected constructor() {}
    constructor(name: String?, description: String?) {
        this.name = name
        this.description = description
    }
}
