import java.util.Scanner;
public class rev {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string");
	String str = sc.nextLine();
	String rev = " ";
	for(int i =0;i<str.length();i++)
	{
		rev = str.charAt(i)+rev;
	}
	System.out.println("reveresed string is:" + rev);
			
}
}
