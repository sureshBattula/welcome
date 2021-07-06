package method_prgrms;
import java.util.Scanner;
public class armstrongNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int limit=sc.nextInt();
		System.out.println("Armstrong Numbers between "+start+" and "+limit+" : "+listOfArmstrong(start,limit));
		sc.close();

	}
	public static String listOfArmstrong(int start,int end) {
		String list="";
		for(int i=start;i<=end;i++) {
			if(isArmstrong(i)) {
				list+=i+" ";
			}
		}
		return list;
	}
	public static int digitCount(int no) {
		int count=0;
		while(no!=0) {
			count+=1;
			no=no/10;
		}
		return count;
	}
	public static int sumOfPowerOfDigits(int no) {
		int sum=0,rem;
		int c=digitCount(no);
		while(no>0) {
			rem=no%10;
			sum+=Math.pow(rem,c);
			no=no/10;
		}
		return sum;
	}
	public static boolean isArmstrong(int no) {
		if(no==sumOfPowerOfDigits(no)) {
			return true;
		}
		else {
			return false;
		}
	}

}
