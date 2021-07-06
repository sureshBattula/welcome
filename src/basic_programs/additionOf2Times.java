package basic_programs;
import java.util.Scanner;
public class additionOf2Times {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour1=sc.nextInt();
		int min1=sc.nextInt();
		int sec1=sc.nextInt();
		int hour2=sc.nextInt();
		int min2=sc.nextInt();
		int sec2=sc.nextInt();
		int total=(hour1+hour2)*3600+(min1+min2)*60+(sec1+sec2);
		//System.out.println(total);
		int newhour=total/3600;
		int remaining=total%3600;
		int newmin=remaining/60;
		int newsec=remaining%60;
		System.out.println(newhour+":"+newmin+":"+newsec);
		sc.close();
		
	}

}
