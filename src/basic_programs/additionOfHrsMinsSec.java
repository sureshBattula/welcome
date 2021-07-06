package basic_programs;
import java.util.Scanner;
public class additionOfHrsMinsSec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour1=sc.nextInt();
		int min1=sc.nextInt();
		int sec1=sc.nextInt();
		int hour2=sc.nextInt();
		int min2=sc.nextInt();
		int sec2=sc.nextInt();
		int newsec=sec1+sec2;
		int newmin=min1+min2;
		int newhour=hour1+hour2;
		if(newsec>60) {
			newsec-=60;
			newmin+=1;
		}
		if(newmin>60) {
			newmin-=60;
			newhour+=1;
		}
		System.out.println(newhour+":"+newmin+":"+newsec);
		sc.close();
		
	}

}
