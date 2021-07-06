package algorithmic_thinking;
import java.util.Scanner;
public class pattern123N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int pattern[][]=new int[num][num];
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i+j<=num-1) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(2+(i+j)-num+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
