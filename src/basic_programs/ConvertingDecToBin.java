package basic_programs;
import java.util.Scanner;
public class ConvertingDecToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int b[]=ConvertingBinary(num);
		for(int i=0;i<b.length-1;i++) {
			System.out.print(b[i]+"");
		}

	}
	public static int[] ConvertingBinary(int no) {
		int arr[]=new int[10];
		int i=0;
		while(no!=0) {
			arr[i]=no%2;
			no=no/2;
			i=i+1;
		}
		int b[]=new int[i+1];
		int k=0;
		for(int j=i-1;j>=0;j--) {
			b[k]=arr[j];
			k=k+1;
		}
		return b;
	}

}
