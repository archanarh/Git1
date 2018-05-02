public class DHLImpl implements IDelivery {

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("DHL delivered the product to: " + name + " " + phone + " " + "at" + address);		
	}


}
