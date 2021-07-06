package method_prgrms;
import java.util.Scanner;
public class perimeterOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		int prmter=calcPermtrOfTrngle(side1,side2,side3);
		System.out.println("perimeter of given sides of triangle: "+prmter);
		sc.close();

	}
	public static int calcPermtrOfTrngle(int a,int b,int c) {
		int result=a+b+c;
		return result;
	}

}
