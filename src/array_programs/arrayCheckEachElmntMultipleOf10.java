package array_programs;
import java.util.Arrays;
import java.util.Scanner;
public class arrayCheckEachElmntMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int res[]=multipleOf10(arr);
		//System.out.println(Arrays.toString(res));
		for(int i:res) {
			System.out.println(i+" ");
		}
		sc.close();

	}
	public static int[] multipleOf10(int arr[]) {
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%10==0) {
				result[i]=arr[i];
			}
			else {
				result[i]=(arr[i]/10+1)*10;
			}
		}
		return result;
	}
}

