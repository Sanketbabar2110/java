package java8.pwing.block;

class Parent {
	
	static {
		System.out.println("Inside Parent Static block");
	}
	
	{
		System.out.println("Inside Parent Instance Block");
	}
	
	Parent(){
		System.out.println("Inside Parent Constructor");
	}
}

public class Child extends Parent{
	
	static {
		System.out.println("Inside Child Static Block");
	}
	
	{
		System.out.println("Inside Child Instance Block");
	}
	
	Child(){
		System.out.println("Inside child Constructor");
	}
	
	public static void main(String[]args) {
		
		System.out.println("Child main method");
		new Child();
	}
}
