package basic_programs;
import java.util.Scanner;
public class gradeCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		double total=sub1+sub2+sub3;
		double percent=(total/300)*100;
		System.out.println(percent);
		if(percent>=90) {
			System.out.println("Grade A");
		}
		else if(percent>=70 && percent<90) {
			System.out.println("Grade B");
		}
		else if(percent>=50 && percent<70) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("FAIL");
		}
		sc.close();
		
	}

	

}
