package abstractFactory.factory

import abstractFactory.product.Apple
import abstractFactory.product.Mango

interface FruitFactory {

    fun createApple(): Apple

    fun createMango(): Mango
}