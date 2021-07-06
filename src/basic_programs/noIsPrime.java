package basic_programs;
import java.util.Scanner;
public class noIsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0,i=1;
		while(i<=Math.sqrt(num)) {
			if(num%i==0) {
				if(i==num/i) {
					count+=1;
				}
				else {
					count+=2;
				}
			}
			i=i+1;
			
		}
		if(count==2) {
			System.out.print("The given number is prime");
		}
		else {
			System.out.print("The given number is not a prime");
		}
		sc.close();
	}

}
