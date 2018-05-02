import java.util.Scanner;
public class revno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int rev = 0;
		while(n!=0)
		{
			int no = n%10;
			rev = rev*10+no;
			n = n/10;
		}
		System.out.println("rev number is: " + rev);
	}
}
