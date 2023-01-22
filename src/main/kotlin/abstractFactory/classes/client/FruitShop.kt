package abstractFactory.classes.client

import abstractFactory.classes.factory.FruitFactory

class FruitShop(factory: FruitFactory) {

    private val apple = factory.createApple()
    private val mango = factory.createMango()

    init {
        apple.drawApple()
        mango.drawMango()
    }
}