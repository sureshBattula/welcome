package array_programs;
import java.util.Arrays;
import java.util.Scanner;
public class arrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(reverseArray(arr)));

	}
	public static int[] reverseArray(int a[]) {
		int rev[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			rev[a.length-1-i]=a[i];
		}
		return rev;
	}
	

}
