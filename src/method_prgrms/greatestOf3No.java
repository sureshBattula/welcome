package method_prgrms;
import java.util.Scanner;
public class greatestOf3No {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("The greatest Number :"+CalcGreatestOf3Num(num1,num2,num3));
		sc.close();
	}
	public static int CalcGreatestOf3Num(int a,int b,int c) {
		int max=a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		return max;
		
	}

}
