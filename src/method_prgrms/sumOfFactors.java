package method_prgrms;
import java.util.Scanner;
public class sumOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(sumOfFact(num));
		sc.close();

	}
	public static int sumOfFact(int no) {
		int sum=0,i=1;
		while(i<=Math.sqrt(no)) {
			if(no%i==0) {
				if(i==no/i) {
					sum+=i;
				}
				else {
					sum+=i+no/i;
				}
			}
			i+=1;
		}
		return sum;
	}

}
