package method_prgrms;
import java.util.Scanner;
public class valueOfExponent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(valueOfExponent(num1,num2));
		sc.close();

	}
	public static int valueOfExponent(int no1,int no2 ) {
		int mul=1,i=0;
		while(mul<no2) {
			mul=mul*no1;
			i=i+1;
		}
		if(mul==no2) {
			return i;
		}
		else {
			return -1;
		}
	}

}
