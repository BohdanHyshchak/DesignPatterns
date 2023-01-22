import abstractFactory.client.FruitShop
import abstractFactory.factory.FruitFactory
import abstractFactory.factory.RedFactory
import abstractFactory.factory.YellowFactory


// Abstract Factory pattern
private val abstractFactoryConcreteType = AbstractFactoryVariety.RED
lateinit var abstractFactory: FruitFactory
lateinit var shop: FruitShop
fun main(args: Array<String>) {
    println("All outputs will be printed here: \n")

    /**
     * Abstract Factory pattern
     */
    println("ABSTRACT FACTORY \n")
    println("Chosen type for abstract factory is: $abstractFactoryConcreteType")
    abstractFactory = when(abstractFactoryConcreteType) {
        AbstractFactoryVariety.RED -> RedFactory()
        AbstractFactoryVariety.YELLOW -> YellowFactory()
    }
    shop = FruitShop(abstractFactory)
}

enum class AbstractFactoryVariety{
    RED, YELLOW
}