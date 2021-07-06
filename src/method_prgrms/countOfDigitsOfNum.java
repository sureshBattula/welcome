package method_prgrms;
import java.util.Scanner;
public class countOfDigitsOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=calcCountOfDgts(num);
		System.out.print(count);
		sc.close();
	}
	public static int calcCountOfDgts(int no) {
		int count=0;
		while(no!=0) {
			count+=1;
			no=no/10;
		}
		return count;
	}

}
