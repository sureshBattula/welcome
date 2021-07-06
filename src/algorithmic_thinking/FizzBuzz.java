package algorithmic_thinking;
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		fizzBuzzSequenceOutput(1,100);
	}
	public static void fizzBuzzSequenceOutput(int start,int limit) {
		for(int i=start;i<=limit;i++) {
			System.out.println(fizzBuzz(i));
		}
	}
	public static String fizzBuzz(int num) {
		String str="";
		if(num%3==0) {
			str+="FIZZ";
		}
		if(num%5==0) {
			str+="BUZZ";
		}
		if(str.length()==0) {
			str+=num;
		}
		return str;
	}

}
