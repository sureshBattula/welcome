package basic_programs;
import java.util.Scanner;
public class nTermsOfFibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<num;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		sc.close();
	}

}
