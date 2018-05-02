
public class IndianPostImpl implements IDelivery {
	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("IndianPost delivered the product to: " + name + " " + phone + " " + "at" + address);		
	}

}
