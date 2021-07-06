package array_programs;
import java.util.Scanner;
public class checkingOfArrayElemtsRPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {23,5,9,13,53};
		String elements[]=checkElementsRPrime(arr);
		for(String s:elements) {
			System.out.println(s);
		}
		sc.close();

	}
	public static String[] checkElementsRPrime(int a[]) {
		String[] str=new String[a.length];
		int i=0;
		for(int element:a) {
			if(isPrime(element)) {
				str[i]=element+" is prime";
			}
			else {
				str[i]=element+" is not prime";
			}
			i+=1;
		}
		return str;
	}
	public static int countOfFact(int no) {
		int count=0;
		for(int i=1;i<=Math.sqrt(no);i++) {
			if(no%i==0) {
				if(i==no/i) {
					count+=1;
				}
				else {
					count+=2;
				}
			}
		}
		return count;
	}
	public static boolean isPrime(int no) {
		return countOfFact(no)==2;
	}
	

}
