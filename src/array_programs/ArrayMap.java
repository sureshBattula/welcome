package array_programs;
import java.util.*;
public class ArrayMap {

	public static void main(String[] args) {
		int arr[]= {2,6,7,5,2,3,4,2,3,6,7,9,5,6};
		Map<Integer,Integer> m=new TreeMap<>();
		for(int i:arr) {
			if(m.containsKey(i)) {
				int value=m.get(i);
				value+=1;
				m.put(i,value);
			}
			else {
				m.put(i,1);
			}
		}
		System.out.println(m);
		for(Map.Entry<Integer,Integer> entry:m.entrySet()) {
			if(entry.getValue()%2!=0) {
				System.out.println(entry.getKey());
			}
		}

	}

}
