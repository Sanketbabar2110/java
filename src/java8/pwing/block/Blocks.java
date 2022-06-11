package java8.pwing.block;

public class Blocks {
/**
 * Block :	- The block is the bunch of statements without signature
 * 			- it is called by JVM internally
 * 
 *	Types of blocks : 
 *						1. Static Block
 *						2. Instance Block
 * 
 * 		purpose :	- Some before provision for loading class static block is used
 * 						like before booking an cab we have to check google map 
 * 						service is up or down
 * 						Ex. to load native libraries 
 * 					- Some before provision required to call constructor
 * 						by reference with object instance block is used.  
 * **/
	
	Blocks(){
		System.out.println("Inside constructor");
	}
	
	static {
		System.out.println("Inside Static Block");
	}
	
	{
		System.out.println("Inside Instance Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		new Blocks();
	}
}
