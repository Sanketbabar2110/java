package java8.pwing.block;

public class Blocks1 {

	Blocks1(){
		System.out.println("inside constructor");
	}
	
	static {
		m1();
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside instance block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside main");
		System.out.println(x);
		
		new Blocks1();
	}
	
	static void m1(){
		System.out.println(x);
	}
	static int x=10;
}
