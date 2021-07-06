package array_programs;
import java.util.Scanner;
public class arrayToStoreCharctrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" elements:");
		char ch[]=new char[size];
		for(int i=0;i<size;i++) {
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Printing array:");
		for(char i:ch) {
			System.out.print(i+" ");
		}
		sc.close();

	}

}
