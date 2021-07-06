package string_prgrms;
import java.util.Scanner;
public class separeteNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="Suresh Battula Welcome";
		//String name=sc.nextLine();
		int index1=name.indexOf(" ");
		System.out.println(name.substring(0,index1));
		System.out.println(name.substring(index1+1));
		
		String[] parts=name.split(" ");
		for(String str:parts) {
			System.out.println(str);
		}
		

	}

}
