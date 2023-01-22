package proxy

import common.DesignPatternExecutor
import proxy.classes.Monobank
import proxy.classes.OnlinePaymentService

class ProxyExecutor: DesignPatternExecutor {

    private val service = OnlinePaymentService()

    private val bank = Monobank(service)

    override fun runExample() {
        println("\n PROXY \n")
        bank.processTransaction(700)
    }
}