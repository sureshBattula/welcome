package string_prgrms;

public class stringDemo {

	public static void main(String[] args) {
		String name="Suresh Battula";
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.indexOf("h"));
		System.out.println(name.indexOf("sh"));
		System.out.println(name.indexOf("s",2));
		System.out.println(name.substring(2,8));
		System.out.println(name.substring(3));
		System.out.println(reverseUsingStringBuffer(name));
		System.out.println(reverseUsingStringBuilder(name));
		String str="@#$h7gfRES!i&";
		System.out.println(removeSpecialChrctrs(str));
		String whiteSpce=" he  l o pr iy a ";
		System.out.println(removeWhiteSpaces(whiteSpce));

    }
	public static String reverseUsingStringBuffer(String s) {
		StringBuffer s1=new StringBuffer(s);
		s1=s1.reverse();
		return s1.toString();
	}
	public static String reverseUsingStringBuilder(String s) {
		StringBuilder s1=new StringBuilder(s);
		s1=s1.reverse();
		return s1.toString();
	}
	public static String removeSpecialChrctrs(String s) {
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		return s;
	}
	public static String removeWhiteSpaces(String s) {
		s=s.replaceAll(" ","");
		return s;
	}
	
	

}
