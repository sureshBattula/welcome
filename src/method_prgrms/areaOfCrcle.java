package method_prgrms;
import java.util.Scanner;
public class areaOfCrcle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		double result=area(radius);
		System.out.println(result);
		sc.close();

	}
	public static double area(double r) {
		double res=3.14*r*r;
		return res;
	}

}
