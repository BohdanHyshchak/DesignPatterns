package abstractFactory.factory

import abstractFactory.product.Apple
import abstractFactory.product.Mango
import abstractFactory.product.RedApple
import abstractFactory.product.RedMango

class RedFactory: FruitFactory {

    init {
        println("Red Factory created")
    }
    override fun createApple(): Apple = RedApple()
    override fun createMango(): Mango = RedMango()
}