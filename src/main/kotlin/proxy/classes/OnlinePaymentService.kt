package proxy.classes

class OnlinePaymentService: PaymentService {
    override fun processTransaction(money: Int) {
        println("Proceeded real transaction")
    }
}