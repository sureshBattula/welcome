package algorithmic_thinking;
import java.util.Scanner;
public class SumOfFibonacciSequnceOfCharrctrs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(wordFibo(word));
		
		

	}
	public static int caluculateFibo(int num) {
		int a=0,b=1,c=0;
		if(num==2) {
			return b;
		}
		for(int i=3;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static int wordFibo(String wrd) {
		int k=0;
		int sum=0;
		for(int i=0;i<wrd.length();i++) {
			char c=wrd.charAt(i);
			int charValue=(int)c;
			if((charValue>=65 && charValue<=90)) {
				k=charValue-64;
				sum=sum+caluculateFibo(k);
			}
			else if(charValue>=97 && charValue<=120) {
				k=(int)c-96;
				sum=sum+caluculateFibo(k);
			}
		}
		return sum;
	}

}
