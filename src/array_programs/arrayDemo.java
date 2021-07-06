package array_programs;
import java.util.Scanner;
public class arrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++) {
		    arr[i]=sc.nextInt();
		}
		System.out.println("Printing array");
		for(int no:arr) {
			System.out.print(no+" ");
		}
		sc.close();

	}

}
