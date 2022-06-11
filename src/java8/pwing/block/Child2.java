package java8.pwing.block;

class Parent2 {
	
	static {
		System.out.println("Inside Parent Static block");
	}
	
	{
		System.out.println("Inside Parent Instance Block");
	}
	
	Parent2(){
		System.out.println("Inside Parent Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Parent main method");
	}
}

public class Child2 extends Parent2 {
	
	static {
		System.out.println("Inside Child Static Block");
	}
	
	{
		System.out.println("Inside Child Instance Block");
	}
	
	Child2(){
		System.out.println("Inside child Constructor");
	}
	
	public static void main(String[]args) {
		
		System.out.println("Child main method");
		new Child2();
	}
}
