PROXY design pattern

We have interface PaymentService, real implementation OnlinePaymentService, and proxy object - Monobank, which uses
OnlinePayment service for transactions only while needed and all requirements for it is satisfied. Real implementation
is triggered only after preparations and checks