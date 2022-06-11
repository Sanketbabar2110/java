package java8.pwing.Constructor;

public class SimpleConstructor {
	  
	  int x;
	  String str;
	  
	public SimpleConstructor(int x, String str) {
		super();
		this.x = x;
		this.str = str;
	}
	  
	 public static void main(String[] args) {
		
		 SimpleConstructor t1 = new SimpleConstructor(10,"Sanket");
		 
		 System.out.println(t1.str);
		 System.out.println(t1.x);
	} 
}
