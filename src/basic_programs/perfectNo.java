package basic_programs;
import java.util.Scanner;
public class perfectNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int given=num;
		int i=2,sum=1;
		while(i<Math.sqrt(num)) {
			if(num%i==0) {
				sum+=i+num/i;
			}
			i=i+1;
		}
		if(given==sum) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		sc.close();
	}

}
