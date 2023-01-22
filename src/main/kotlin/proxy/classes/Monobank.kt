package proxy.classes

class Monobank(private val realService: OnlinePaymentService): PaymentService {

    private val currentBalance
        get() = getCurrentMoneyBalance()
    override fun processTransaction(money: Int) {
        if(checkPossibility(money)) {
            realService.processTransaction(money)
        }
    }

    private fun checkPossibility(money: Int) = currentBalance > money

    private fun getCurrentMoneyBalance() = 1000

}