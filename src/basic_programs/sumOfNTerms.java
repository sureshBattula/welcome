package basic_programs;
import java.util.Scanner;
public class sumOfNTerms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int givenNo=num;
		int sum=0;
		while(num!=0) {
			sum+=num;
			num-=1;
		}
		System.out.println("The sum of "+givenNo+" natural numbers : "+sum);
		sc.close();
	}

}
