package class_object;
//import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int marks1[]= {89,78,98,76,56};
		Student s1=new Student(101,"Suresh",marks1);
		
		int marks2[]= {89,97,90,76,56};
		Student s2=new Student(102,"Ramesh",marks2);
		
		int marks3[]= {76,87,56,69,98};
		Student s3=new Student(103,"Radha",marks3);
		
		int marks4[]= {76,87,98,98,78};
		Student s4=new Student(104,"vikas",marks4);
		
		int marks5[]= {59,65,73,81,97};
		Student s5=new Student();
		s5.id=105;
		s5.marks=marks5;
		
		System.out.println(s1.id+"\t"+s1.name+"\t"+s1.getPercentage());
		System.out.println(s2.id+"\t"+s2.name+"\t"+s2.getPercentage());
		System.out.println(s3.id+"\t"+s3.name+"\t"+s3.getPercentage());
		System.out.println(s4.id+"\t"+s4.name+"\t"+s4.getPercentage());
		System.out.println(s5.id+"\t"+s5.name+"\t"+s5.getPercentage());
		
		System.out.println(s5.toString());

	}

}
