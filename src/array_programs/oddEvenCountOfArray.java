package array_programs;
import java.util.Scanner;
public class oddEvenCountOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {23,55,20,65,78};
		int oddterms=arr.length-countOfEvntrmsOfArray(arr);
		System.out.println(oddterms+" odd numbers");
		System.out.println(countOfEvntrmsOfArray(arr)+" even numbers");
		sc.close();

	}
	public static int countOfEvntrmsOfArray(int a[]) {
		int evncount=0;
		for(int i:a) {
			if(i%2==0) {
				evncount+=1;
			}
		}
		return evncount;
	}

}
