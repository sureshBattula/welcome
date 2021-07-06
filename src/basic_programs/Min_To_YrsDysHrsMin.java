package basic_programs;
import java.util.Scanner;
public class Min_To_YrsDysHrsMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int gvnmin=sc.nextInt();
		int years=gvnmin/525600;
		int remmin=gvnmin%525600;
		int days=remmin/1440;
		remmin=remmin%1440;
		int hours=remmin/60;
		int min=remmin%60;
		System.out.println("given minutes can be expressed as "+years+"years "+days+"days "+hours+"hours "+min+"minutes.");
		
	}

}
