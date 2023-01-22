package abstractFactory

import abstractFactory.classes.client.FruitShop
import abstractFactory.classes.factory.FruitFactory
import abstractFactory.classes.factory.RedFactory
import abstractFactory.classes.factory.YellowFactory
import common.DesignPatternExecutor


// Abstract Factory pattern
private val abstractFactoryConcreteType = AbstractFactoryVariety.RED
lateinit var abstractFactory: FruitFactory
lateinit var shop: FruitShop

/**
 * Abstract Factory pattern
 */
class AbstractFactoryExecutor: DesignPatternExecutor {

    override fun runExample() {
        println("\n ABSTRACT FACTORY \n")
        println("Chosen type for abstract factory is: $abstractFactoryConcreteType")
        abstractFactory = when(abstractFactoryConcreteType) {
            AbstractFactoryVariety.RED -> RedFactory()
            AbstractFactoryVariety.YELLOW -> YellowFactory()
        }
        shop = FruitShop(abstractFactory)
    }
}

enum class AbstractFactoryVariety{
    RED, YELLOW
}