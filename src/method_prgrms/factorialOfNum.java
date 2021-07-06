package method_prgrms;
import java.util.Scanner;
public class factorialOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(calcFact(num));
		sc.close();

	}
	public static int calcFact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}

}
