package class_object;
import java.util.Scanner;
public class percentageMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		percentageof5SubMarks p1=new percentageof5SubMarks();
		p1.id=202121;
		p1.name="swapna";
		System.out.println("Enter 5 subject Marks of "+p1.name);
		for(int i=0;i<5;i++) {
			p1.arr[i]=sc.nextInt();
		}
		
		
		percentageof5SubMarks p2=new percentageof5SubMarks();
		p2.id=202122;
		p2.name="ramesh";
		System.out.println("Enter 5 subject Marks of "+p2.name);
		for(int i=0;i<5;i++) {
			p2.arr[i]=sc.nextInt();
		}
		
		percentageof5SubMarks p3=new percentageof5SubMarks();
		p3.id=202123;
		p3.name="Swaroop";
		System.out.println("Enter 5 subject Marks of "+p3.name);
		for(int i=0;i<5;i++) {
			p3.arr[i]=sc.nextInt();
		}
		
		
		System.out.println(p1.id+" "+p1.getPercentage());
		System.out.println(p2.id+" "+p2.getPercentage());
		System.out.println(p3.id+" "+p3.getPercentage());

	}

}
