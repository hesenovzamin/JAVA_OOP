package Task27122023;

public interface PaymentMethod {
    boolean processPayment(double amount);
    String getProviderName();
}
