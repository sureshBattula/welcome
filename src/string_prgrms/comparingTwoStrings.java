package string_prgrms;
import java.util.Scanner;
public class comparingTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(isStringsAreEqual(str1,str2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
		sc.close();

	}
	public static boolean isStringsAreEqual(String s1,String s2) {
		return s1.equals(s2);
	}

}
