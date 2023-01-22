package abstractFactory.classes.factory

import abstractFactory.classes.product.Apple
import abstractFactory.classes.product.Mango
import abstractFactory.classes.product.YellowApple
import abstractFactory.classes.product.YellowMango

class YellowFactory: FruitFactory {

    init {
        println("Yellow Factory created")
    }
    override fun createApple(): Apple = YellowApple()

    override fun createMango(): Mango = YellowMango()
}