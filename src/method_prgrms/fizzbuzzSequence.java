package method_prgrms;
import java.util.Scanner;
public class fizzbuzzSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			if(isDivisibleby3(i) && isDivisibleby5(i)) {
				System.out.println("FIZZBUZZ");
			}
			else if(isDivisibleby3(i)) {
				System.out.println("FIZZ");
			}
			else if(isDivisibleby5(i)) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);
			}
		}
		sc.close();

	}
	public static boolean isDivisibleby3(int no) {
		return no%3==0;
	}
	public static boolean isDivisibleby5(int no) {
		return no%5==0;
	}
	

}
