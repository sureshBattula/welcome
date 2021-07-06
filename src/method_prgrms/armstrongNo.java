package method_prgrms;
import java.util.Scanner;
public class armstrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println("The given number is armstrong number");
		}
		else {
			System.out.println("The given number is not armstrong");
		}
		sc.close();
	}
	public static int countOfDigits(int no) {
		int div,count=0;
		while(no!=0) {
			div=no%10;
			count+=1;
			no=no/10;
		}
		return count;
	}
	public static int SumOfPower(int no) {
		int c=countOfDigits(no);
		int sum=0,rem;
		while(no!=0) {
			rem=no%10;
			sum+=Math.pow(rem, c);
			no=no/10;
		}
		return sum;
	}
	public static boolean isArmstrong(int no) {
		if(no==SumOfPower(no)) {
			return true;
		}
		else {
			return false;
		}
	}

}
