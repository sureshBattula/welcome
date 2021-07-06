package method_prgrms;
import java.util.Scanner;
public class checkAllDigitsROdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isAllDigitsROdd(num)) {
			System.out.println("All digits are odd");
		}
		else {
			System.out.println("All digits are not odd");
		}
		sc.close();
	}
	public static int digitCount(int no) {
		int count=0;
		while(no!=0) {
			count+=1;
			no=no/10;
		}
		return count;
	}
	public static int oddDigitCount(int no) {
		int digit,count=0;
		while(no!=0) {
			digit=no%10;
			if(digit%2!=0) {
				count+=1;
			}
			no=no/10;
		}
		return count;
	}
	public static boolean isAllDigitsROdd(int no) {
		if(digitCount(no)==oddDigitCount(no)) {
			return true;
		}
		else {
			return false;
		}
	}

}
