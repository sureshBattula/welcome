package method_prgrms;
import java.util.Scanner;
public class perfectNoCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPerfect(num)) {
			System.out.println(num+" is a perfect Number");
		}
		else {
			System.out.println(num+" is not a perfect Number");
		}
		sc.close();

	}
	public static int sumOfFactors(int no) {
		int i=2,sum=1;
		while(i<=Math.sqrt(no)) {
			if(no%i==0) {
				if(i==no/i) {
					sum=sum+i;
				}
				else {
					sum=sum+i+no/i;
				}
			}
			i=i+1;
		}
		return sum;
	}
	public static boolean isPerfect(int no) {
		return no==sumOfFactors(no);
	}

}
