package string_prgrms;
import java.util.Scanner;
public class cnvrtingAllChrctrsToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(convertingToUpper(str));
		sc.close();

	}
	public static String convertingToUpper(String s) {
		s=s.toUpperCase();
		return s;
	}

}
