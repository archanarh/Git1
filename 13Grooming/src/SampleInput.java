import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SampleInput {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string");
			String name = br.readLine();
			System.out.println("Enter the college name ");
			String colgName = br.readLine();
			System.out.println(name + " " + colgName);
		}catch(Exception e) {
			System.out.println("This is catch");
		}
	}
}
