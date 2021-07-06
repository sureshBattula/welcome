package method_prgrms;
import java.util.Scanner;
public class oddPallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isOddPallendrome(num)) {
			System.out.println("The given is oddPallendrome");
		}
		else {
			System.out.println("The given is not a oddPallendrome");
		}
		sc.close();

	}
	public static boolean isOddPallendrome(int no) {
		if(reverse(no)==no) {
			if(allDigitsROdd(no)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public static boolean allDigitsROdd(int no) {
		int digit;
		while(no!=0) {
			digit=no%10;
			if(digit%2==0) {
				return false;
			}
			no/=10;
		}
		return true;
	}
	public static int reverse(int no) {
		int rvrs=0,digit;
		while(no!=0) {
			digit=no%10;
			rvrs=rvrs*10+digit;
			no/=10;
		}
		return rvrs;
	}

}
