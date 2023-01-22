package abstractFactory.factory

import abstractFactory.product.Apple
import abstractFactory.product.Mango
import abstractFactory.product.YellowApple
import abstractFactory.product.YellowMango

class YellowFactory: FruitFactory {

    init {
        println("Yellow Factory created")
    }
    override fun createApple(): Apple = YellowApple()

    override fun createMango(): Mango = YellowMango()
}