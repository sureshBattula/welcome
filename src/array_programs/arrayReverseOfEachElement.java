package array_programs;
import java.util.Scanner;
public class arrayReverseOfEachElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int num=sc.nextInt();
		int arr[]= new int[num];
		System.out.println("Enter the elements:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse of each element in array:");
		for(int i=0;i<num;i++) {
			System.out.print(reverse(arr[i])+" ");
		}
		sc.close();
		

	}
	public static int reverse(int no) {
		int reverse=0,rem;
		while(no!=0) {
			rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		return reverse;
	}

}
