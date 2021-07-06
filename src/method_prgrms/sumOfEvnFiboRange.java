package method_prgrms;
import java.util.Scanner;
public class sumOfEvnFiboRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(calculateSumOfEvenTermsOfFibo(num));
		sc.close();

	}
	public static int calculateSumOfEvenTermsOfFibo(int no) {
		int a=0,b=1,c;
		int sum=0;
		while(a<no) {
			c=a+b;
			a=b;
			b=c;
			if(a%2==0) {
				sum+=a;
			}
			
		}
		return sum;
	}

}
