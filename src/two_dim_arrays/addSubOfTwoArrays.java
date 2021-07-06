package two_dim_arrays;
import java.util.Scanner;
public class addSubOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int row=sc.nextInt();
		System.out.println("Enter no of columns:");
		int col=sc.nextInt();
		System.out.println("Filling of Matrice1");
		int matrix1[][]=inputMatrix(row,col);
		System.out.println("Filling of Matrice2");
		int matrix2[][]=inputMatrix(row,col);
		System.out.println("Printing Of Matrix 1");
		display(matrix1);
		System.out.println();
		System.out.println("Printing Of Matrix 2");
		display(matrix2);
		System.out.println();
		int add[][]=sumOfTwoMatrix(matrix1,matrix2);
		int sub[][]=diffOfTwoArrays(matrix1,matrix2);
		System.out.println("Addition of Two Matrices");
		display(add);
		System.out.println();
		System.out.println("subtraction of Two Matrices");
		display(sub);
		sc.close();
		

	}
	public static void display(int a[][]) {
		for(int[] nums:a) {
			for(int num:nums) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	public static int[][] inputMatrix(int r,int c){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[r][c];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements for row:"+i);
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static int[][] sumOfTwoMatrix(int a[][],int b[][]){
		int sum[][]=new int[a.length][a[0].length];
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[0].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
	public static int[][] diffOfTwoArrays(int a[][],int b[][]){
		int diff[][]=new int[a.length][a[0].length];
		for(int i=0;i<diff.length;i++) {
			for(int j=0;j<diff[0].length;j++) {
				diff[i][j]=a[i][j]-b[i][j];
			}
		}
		return diff;
	}
	

}
