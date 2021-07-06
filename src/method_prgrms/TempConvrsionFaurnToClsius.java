package method_prgrms;
import java.util.Scanner;
public class TempConvrsionFaurnToClsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double faurn=sc.nextDouble();
		System.out.println(ConvrtFaurnToClsius(faurn));
		sc.close();

	}
	public static double ConvrtFaurnToClsius(double frn) {
		double clsis=5*(frn-32)/9;
		return Math.round(clsis);
	}

}
