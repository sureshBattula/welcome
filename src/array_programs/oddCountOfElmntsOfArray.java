package array_programs;
import java.util.Scanner;
public class oddCountOfElmntsOfArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,1,3,2,3,4,4,3,4,4,6};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			int value=a[i];
			if(a[i]!=-1) {
				for(int j=0;j<a.length;j++) {
					if(value==a[j]) {
						count++;
						a[j]=-1;
					}
				}
				if(count%2!=0) {
					System.out.println(value+"-"+count+" times");
				}
			}
		}

	}

}
