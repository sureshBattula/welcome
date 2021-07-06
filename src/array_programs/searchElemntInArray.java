package array_programs;
import java.util.Scanner;
public class searchElemntInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int element=sc.nextInt();
		if(elementFoundInArray(arr,element)) {
			System.out.println("Number Found");
		}
		else {
			System.out.println("Number Not Found");
		}
		sc.close();

	}
	public static boolean elementFoundInArray(int a[],int checkValue) {
		for(int i:a) {
			if(i==checkValue) {
				return true;
			}
		}
		return false;
	}

}
