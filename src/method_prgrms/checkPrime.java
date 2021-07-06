package method_prgrms;
import java.util.Scanner;
public class checkPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(checkIsPrime(num)) {
			System.out.println("The given no is a prime");
		}
		else {
			System.out.println("Not a prime number");
		}
		sc.close();

	}
	public static int checkNoOfFactors(int no) {
		int i=1,count=0;
		while(i<=Math.sqrt(no)) {
			if(no%i==0) {
				if(i==no/i) {
					count+=1;
				}
				else {
					count+=2;
				}
			}
			i+=1;
		}
		return count;
	}
	public static boolean checkIsPrime(int no) {
		if(checkNoOfFactors(no)==2) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
