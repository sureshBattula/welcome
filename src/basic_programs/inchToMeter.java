package basic_programs;
import java.util.Scanner;
public class inchToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double inch=sc.nextDouble();
		double meter=inch*0.0254;
		System.out.println((int)inch+" inches is equal to "+meter+" meters");
		

	}

}
