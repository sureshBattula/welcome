package string_prgrms;
import java.util.Scanner;
public class replacingCharactrsOfd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(replacingchrtrs(str));
		sc.close();

	}
	public static String replacingchrtrs(String s) {
		s=s.replace('d','t');
		return s;
	}

}
