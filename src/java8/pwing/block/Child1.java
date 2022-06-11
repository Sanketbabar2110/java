package java8.pwing.block;

class Parent1 {
	
	static {
		System.out.println("Inside Parent Static block");
	}
	
	{
		System.out.println("Inside Parent Instance Block");
	}
	
	Parent1(){
		System.out.println("Inside Parent Constructor");
	}
}

public class Child1 extends Parent1{
	
	static {
		System.out.println("Inside Child Static Block");
	}
	
	{
		System.out.println("Inside Child Instance Block");
	}
	
	Child1(){
		System.out.println("Inside child Constructor");
	}
	
	public static void main(String[]args) {
		
		System.out.println("Child main method");
		new Parent1();
	}
}
