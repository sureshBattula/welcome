package basic_programs;
import java.util.Scanner;
public class noOfFactorsOfGvnNo {
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
			i+=1;
		}
		System.out.print(count);
		sc.close();
	}

}
