
public class FedExImpl implements IDelivery{

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("FEdEX delivered the product to: " + name + " " + phone + " " + "at" + address);		
	}

}
