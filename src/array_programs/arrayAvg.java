package array_programs;
import java.util.Scanner;
public class arrayAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("The average value:"+calculateArrayAvg(arr));
		sc.close();

	}
	public static double calculateArrayAvg(int a[]) {
		int sum=0,noofterms=a.length;
		for(int i:a) {
			sum=sum+i;
		}
		double avg=(double)sum/noofterms;
		return avg;
	}

}
