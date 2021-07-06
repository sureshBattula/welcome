package string_prgrms;
import java.util.Scanner;
public class sortingString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		System.out.println(SortingOfString(str));
		sc.close();

	}
	public static char[] sortingOfCharacters(String s) {
		char[] ch=s.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if((int)ch[i]>(int)ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
		
	}
	public static String SortingOfString(String str) {
	    char chr[]=sortingOfCharacters(str);
	    return new String(chr);
	}

}
