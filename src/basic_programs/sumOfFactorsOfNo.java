package basic_programs;
import java.util.Scanner;
public class sumOfFactorsOfNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,i=1;
		while(i<=Math.sqrt(num)) {
			if(num%i==0) {
				if(i==num/i) {
					sum+=i;
				}
				else {
					sum+=i+num/i;
				}
			}
			i+=1;
	
		}
		System.out.print(sum);
		
		sc.close();
	}

}
