import abstractFactory.AbstractFactoryExecutor
import proxy.ProxyExecutor

fun main(args: Array<String>) {
    println("All outputs will be printed here: \n")

    val abstractFactoryExecutor = AbstractFactoryExecutor()
    val proxyExecutor = ProxyExecutor()

    abstractFactoryExecutor.runExample()
    proxyExecutor.runExample()
}