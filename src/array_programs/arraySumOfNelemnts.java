package array_programs;
import java.util.Scanner;
public class arraySumOfNelemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of terms of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(calculateSumOfIntegers(arr));
		sc.close();
	}
	public static int calculateSumOfIntegers(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}

}
