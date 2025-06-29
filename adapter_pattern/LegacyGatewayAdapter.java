
public class LegacyGatewayAdapter implements PaymentProcessor {
    private String transactionId;
    private final LegacyGateway legacyGateway;
    
    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
    	this.legacyGateway = legacyGateway;
    }
	
	@Override
	public void processPayment(double amount, String currency) {
		System.out.println("LegacyGatewayAdapter: Translating processPayment() for " + currency + ": " + amount);
		this.legacyGateway.executeTransaction(amount, currency);
		this.transactionId = String.valueOf(this.legacyGateway.getReferenceNumber());
	}

	@Override
	public boolean isPaymentSuccessful() {
		return this.legacyGateway.checkStatus(Long.parseLong(this.transactionId));
	}

	@Override
	public String getTransactionId() {
		return this.transactionId;
	}

}
