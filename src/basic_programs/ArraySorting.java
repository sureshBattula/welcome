package basic_programs;
import java.util.Scanner;
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]=new int[no];
		int s;
		for(int i=0;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<no;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<no;i++) {
			for(int j=i+1;j<no;j++) {
				if(arr[i]>arr[j]) {
					s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		for(int i=0;i<no;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
