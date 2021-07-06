package two_dim_arrays;
import java.util.Scanner;
public class twoDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int row=sc.nextInt();
		System.out.println("Enter col:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements for row "+i);
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Printing the array");
		for(int[] nums:arr) {
			for(int num:nums) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		sc.close();

	}

}
