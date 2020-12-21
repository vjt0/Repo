import java.util.Scanner;

public class Quesolve {

	public static void main(String[] args) {

		String str = "000000000000000000";
		int count = 0;
		for (int i = 0; i <= str.length() - 1;) {
			
			if (str.substring(i, i + 3).equalsIgnoreCase("010")) {
				System.out.println(str.substring(i, i + 3));
				count++;
				i = i + 3;} else {
				i = i + 1;
				}}
		     System.out.println(count);

	}
}