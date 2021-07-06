package algorithmic_thinking;
import java.util.Scanner;
public class NextPalindromeOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(nextPalindrome(num));
		sc.close();
	}
	public static int reverse(int no) {
		int digit,rev=0;
		while(no!=0) {
			digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}
		return rev;
	}
	public static int nextPalindrome(int num) {
		if(num==reverse(num)) {
			return num;
		}
		else {
			return nextPalindrome(num+1);
		}
		
	}

}
