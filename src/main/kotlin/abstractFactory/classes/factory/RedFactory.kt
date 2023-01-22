package abstractFactory.classes.factory

import abstractFactory.classes.product.Apple
import abstractFactory.classes.product.Mango
import abstractFactory.classes.product.RedApple
import abstractFactory.classes.product.RedMango

class RedFactory: FruitFactory {

    init {
        println("Red Factory created")
    }
    override fun createApple(): Apple = RedApple()
    override fun createMango(): Mango = RedMango()
}