package string_prgrms;
import java.util.Scanner;
public class TakenInputInStringNdCalcSpeed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int distance=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int timeinsecs=caluculateTimeInSec(str);
		double speedinmetpersec=caluclateSpeedinMetPerSec(distance,timeinsecs);
		System.out.println("Speed in meter/sec: "+speedinmetpersec);
		System.out.println("Speed in kilometer/hour: "+speedinmetpersec*3.6);
		System.out.println("Speed in mile/hour: "+speedinmetpersec*2.23694);
        sc.close();
	}
	public static int caluculateTimeInSec(String s) {
		String time[]=s.split(":");
		int hours=Integer.parseInt(time[0]);
		int mins=Integer.parseInt(time[1]);
		int secs=Integer.parseInt(time[2]);
		return hours*3600+mins*60+secs;
	}
	public static double caluclateSpeedinMetPerSec(int dist,int time) {
		return (double)dist/time;
	}

}
