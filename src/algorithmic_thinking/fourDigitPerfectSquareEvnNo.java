package algorithmic_thinking;
import java.util.Scanner;
public class fourDigitPerfectSquareEvnNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		//System.out.println(isPerfectSquare(num));
		perfectSquares(1000,9999);
		
	}
	public static boolean isPerfectSquare(int num) {
		int result=(int)Math.sqrt(num);
		return result*result==num;
	}
	public static boolean isAllDigitsREvn(int num) {
		int digitCount=0,digit;
		while(num!=0) {
			digit=num%10;
			if(digit%2==0) {
				digitCount+=1;
			}
			num=num/10;
		}
		return digitCount==4;
	}
	public static void perfectSquares(int start,int limit) {
		for(int i=start;i<=limit;i+=2) {
			if(isPerfectSquare(i) && isAllDigitsREvn(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
