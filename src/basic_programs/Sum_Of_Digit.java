package basic_programs;
import java.util.Scanner;
public class Sum_Of_Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem;
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.print(sum);
		sc.close();
	}

}
