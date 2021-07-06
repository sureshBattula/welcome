package string_prgrms;
import java.util.Scanner;
public class stringWordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("No of words: "+wordCount(str));
		sc.close();

	}
	public static int wordCount(String s) {
		int count=0;
		String[] str=s.split(" ");
		/*for(String i:str) {
			count+=1;
		}
		return count;	*/
		return str.length;
	}

}
