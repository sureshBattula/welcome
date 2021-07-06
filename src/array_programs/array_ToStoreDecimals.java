package array_programs;
import java.util.Scanner;
public class array_ToStoreDecimals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		System.out.println("enter "+size+" elements");
		double arr[]=new double[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextDouble();
		}
		System.out.println("Printing array");
		for(double no:arr) {
			System.out.print(no+" ");
		}
		sc.close();
		
	}

}
