package class_object;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile iphone=new Mobile();
		iphone.Ram=6;
		iphone.Processor="Alt-7";
		iphone.Battery=3500;
		//iphone.communication();
		//iphone.entertainment();
		//iphone.browsing();
		iphone.display();
		System.out.println("_______Iphone________________________________________________________________");
		
		Mobile samsung=new Mobile();
		samsung.Ram=8;
		samsung.Battery=4500;
		samsung.Processor="normal processor";
		samsung.display();
		//samsung.browsing();
		System.out.println("_______________________samsung__________________________________________________");

	}

}
