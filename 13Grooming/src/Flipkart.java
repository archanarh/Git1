import java.util.Random;
import java.util.Scanner;

public class Flipkart {
	void sell()
	{
		Random r = new Random();
		int option = r.nextInt(3) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your phone number");
		long phone = sc.nextLong();
		sc.nextLine();     //use this dummy line, if u dont use it, it wont accept the next input.i.e. address
		System.out.println("Enter the address: ");
		String address = sc.nextLine();
		if(option == 1)
		{
			FedExImpl f = new FedExImpl();
			f.deliverProduct(name, phone, address);
		}
		else if(option == 2)
		{
			IndianPostImpl ipl = new IndianPostImpl();
			ipl.deliverProduct(name, phone, address);
		}
		else if(option ==3)
		{
			DHLImpl dhl = new DHLImpl();
			dhl.deliverProduct(name, phone, address);
		}
	}
}
