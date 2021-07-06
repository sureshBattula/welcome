package string_prgrms;
import java.util.Scanner;
public class replacingChrctrsLowerUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(convertingAllCharacters(str));
		sc.close();

	}
	public static String convertingAllCharacters(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				str+=Character.toUpperCase(c);
			}
			else if(Character.isUpperCase(c)) {
				str+=Character.toLowerCase(c);
			}
			else {
				str+=" ";
			}
		}
		return str;
	}

}
