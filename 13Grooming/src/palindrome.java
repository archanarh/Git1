import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		boolean rs = isPalindrome(str);
		if (rs)
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("Entered string is not a palindrome");
	}
	public static boolean isPalindrome(String str)
	{
		char ch[] = str.toCharArray();
		for(int i =0; i<ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
				return false;
		}
		return true;
	}
}
