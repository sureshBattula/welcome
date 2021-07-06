package two_dim_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class highestRowElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=3,col=3;
		int[][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements in row "+i);
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println(Arrays.toString(findMaxInEachRow(arr)));
		
	}
	public static int[] findMaxInEachRow(int a[][]) {
		int max=0,i=0;
		int result[]=new int[a.length];
		for(int[] nums:a) {
			max=nums[0];
			for(int num:nums) {
				if(max<num) {
					max=num;
				}
			}
			result[i]=max;
			i+=1;
		}
		return result;
	}

}
