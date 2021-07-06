package algorithmic_thinking;
import java.util.Scanner;
public class NoOfAlmondsForNdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfDays=sc.nextInt();
		System.out.println("Tom bought "+numberOfAlmond(noOfDays)+" Almonds for next "+noOfDays+" days");

	}
	public static int numberOfAlmond(int days) {
		int d1=2,d2=3,d3=5,d4;
		int noOfAlmonds=d1+d2+d3;
		for(int i=4;i<=days;i++) {
			d4=d1+d2+d3;
			noOfAlmonds+=d4;
			d1=d2;
			d2=d3;
			d3=d4;
		}
		return noOfAlmonds;
	}

}
