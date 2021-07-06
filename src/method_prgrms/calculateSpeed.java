package method_prgrms;
import java.util.Scanner;
public class calculateSpeed {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double distance=sc.nextDouble();
		double time=sc.nextDouble();
		double speed=findingOfSpeed(distance,time);
		System.out.println("speed = "+speed+" km/hr");
		sc.close();
	}
	public static double findingOfSpeed(double dstnce,double tme) {
		double spd=dstnce/tme;
		double res=Math.round(spd);
		return res;
		
	}

}
