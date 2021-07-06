package method_prgrms;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=add(n1,n2);
        System.out.println(sum);

	}
	public static int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}

}
