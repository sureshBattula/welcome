package method_prgrms;
import java.util.Scanner;
public class findingOfWorkDuration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("After "+n+" days his workout duration : "+workDuration(n)+" mins");
		sc.close();

	}
	public static int workDuration(int n) {
		int a=1,b=2,c=3;
		int d=0;
		for(int i=4;i<=n;i++) {
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
		return d;
	}

}
