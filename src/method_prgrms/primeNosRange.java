package method_prgrms;
import java.util.Scanner;
public class primeNosRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int limit=sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+limit+" : "+listOfPrime(start,limit));
		sc.close();

	}
	public static String listOfPrime(int start,int limit) {
		String list="";
		for(int i=start;i<=limit;i++) {
			if(isPrime(i)) {
				list+=i+" ";
			}
		}
		return list;
	}
	public static int countOfFactors(int no) {
		int i=1,count=0;
		while(i<=Math.sqrt(no)) {
			if(no%i==0) {
				if(i==no/i) {
					count+=1;
				}
				else {
					count+=2;
				}
			}
			i=i+1;
		}
		return count;
	}
	public static boolean isPrime(int no) {
		if(countOfFactors(no)==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
