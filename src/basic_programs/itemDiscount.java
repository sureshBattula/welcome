package basic_programs;
import java.util.Scanner;
public class itemDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int costprice=sc.nextInt();
		int discount;
		if(costprice<=10000) {
			discount=10;
		}
		else if(costprice<=20000) {
			discount=20;
		}
		else {
			discount=25;
		}
		double sellingprice=costprice-(costprice*discount/100);
		System.out.println(sellingprice);
		sc.close();

	}

}
