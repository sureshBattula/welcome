package string_prgrms;
import java.util.Scanner;
public class reversingCharactersOfWordsOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(convertingCharactrs(str));
		sc.close();

	}
	public static String convertingCharactrs(String s) {
		String str[]=s.split(" ");
		String str2="";
		for(int i=0;i<str.length;i++) {
			char ch[]=str[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				str2+=ch[j];
			}
			str2+=" ";
		}
		return str2;
	}

}
