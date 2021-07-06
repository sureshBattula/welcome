package basic_programs;
import java.util.Scanner;
public class armStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int gvn=num;
		int data=num;
		int count=0;
		while(gvn!=0) {
			count+=1;
			gvn=gvn/10;
			
		}
		
		int sum=0,rem,res=1;
		while(data!=0) {
			rem=data%10;
			res=1;
			for(int i=0;i<count;i++) {
				res*=rem;
			}
			sum+=res;
			data=data/10;
		}
		
		if(sum==num) {
			System.out.println("The given no is armstrong");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		sc.close();
	}

}
