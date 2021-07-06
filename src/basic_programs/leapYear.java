package basic_programs;
import java.util.Scanner;
public class leapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year>999 && year<=9999) {
			if((year%4==0 && year%100!=0) || year%400==0) {
				System.out.println(year+" is leap year");
			}
			else {
				System.out.println(year+" is not a leap year");
			}
		}
		else {
			System.out.print("invalid year");
		}
		sc.close();
	}

}
