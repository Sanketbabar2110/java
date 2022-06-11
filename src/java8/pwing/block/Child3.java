package java8.pwing.block;

class Parent3 {
	
	static {
		System.out.println("Inside Parent Static block");
	}
	
	{
		System.out.println("Inside Parent Instance Block");
	}
	
	Parent3 (){
		System.out.println("Inside Parent Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Parent main method");
	}
}

public class Child3 {
	
	static {
		System.out.println("Inside Child Static Block");
	}
	
	{
		System.out.println("Inside Child Instance Block");
	}
	
	Child3(){
		System.out.println("Inside child Constructor");
	}
	
	public static void main(String[]args) {
		
		System.out.println("Child main method");
		new Parent3();
	}
}
