package abstractFactory.classes.factory

import abstractFactory.classes.product.Apple
import abstractFactory.classes.product.Mango

interface FruitFactory {

    fun createApple(): Apple

    fun createMango(): Mango
}