package exercicios.exercicio27.model.services;

public class PayPalPaymentService implements PaymentService{

    @Override
    public double paymentFee(double amount) {
        return 0;
    }

    @Override
    public double interest(double amount, int months) {
        return 0;
    }
}
