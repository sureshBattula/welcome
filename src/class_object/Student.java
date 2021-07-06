package class_object;

public class Student {
	int id;
	String name;
	int marks[]=new int[5];
	
	Student() {}
	Student(int i,String s,int m[]){
		id=i;
		name=s;
		marks=m;
	}
	public double getPercentage() {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=marks[i];
		}
		return (double)sum/5;
	}
	public String toString() {
		return "ID :"+id+" Name :"+name+" Marks :"+marks;
	}

    
}
