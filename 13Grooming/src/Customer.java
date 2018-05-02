
public class Customer {
void purchase()
{
	System.out.println("Logged in to flipkart");
	Flipkart f = new Flipkart();
	System.out.println("Requesting flipkart to sell product ");
	f.sell();
}
public static void main(String[] args) {
System.out.println("Customer is present");
	Customer c = new Customer();
	System.out.println("Customer purchases the product");
	c.purchase();
}
}
