package method_prgrms;
import java.util.Scanner;
public class noReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int rvrs=ReverseNumber(num);
		int rvrs2=ReverseNumber(num2);
		System.out.println("reverse of "+num+" "+num2+" : "+rvrs+" "+rvrs2);
		sc.close();
		

	}
	public static int ReverseNumber(int no) {
		int reverse=0,rem;
		while(no!=0) {
			rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		return reverse;
	}

}
