package java8.pwing.Object;

/*	getClass()	:	this method returns runtime class of an object
  					- it returns fully qualified name of class 
  						i.e 
  								Package name + className
  		
  		public final native Class<?> getClass();
 */
 
public class GetClassMethod {
	
	public static void main(String[] args) {
		
		GetClassMethod G1 = new GetClassMethod();
		EBooks b1 = new EBooks(600, "MrutunJay", "Shivaji Sawant");
		
		System.out.println(G1.getClass());
		System.out.println(b1.getClass());
	}
}
