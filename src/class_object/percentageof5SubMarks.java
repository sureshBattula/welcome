package class_object;

public class percentageof5SubMarks {
    int id;
    String name;
    int arr[]=new int[5];
    
    public double getPercentage() {
    	int sum=0;
    	for(int i=0;i<5;i++) {
    		sum+=arr[i];
    	}
    	
    	return (double)sum/5;
    }
}
