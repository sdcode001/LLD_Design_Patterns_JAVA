
public class DemoAdapter {

	public static void main(String[] args) {
       LegacyGateway paymentGateway = new LegacyGateway();
       LegacyGatewayAdapter paymentGatewayAdapter = new LegacyGatewayAdapter(paymentGateway);
       CheckoutService checkoutService = new CheckoutService(paymentGatewayAdapter);
       
       checkoutService.checkout(1200, "INR");
	}

}
