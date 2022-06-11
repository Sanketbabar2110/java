package java8.pwing.Object;

/*	equals() :   - it is method of object class by default available to every class
  					logic of object class method is '==' operator 
  				 - which is meant for reference comparison i.e. both reference point
  				   to the same object then returns true
 				 - it is also called as reference equality operator
 				 - it checks physical memory location for that reference
 		
 		public boolean equals(Object Obj)
 */
public class EqualsMethod {
	
	public static void main(String[] args) {
		
		 StringBuffer sb1 = new StringBuffer("Sanket");
		 StringBuffer sb2 = new StringBuffer("Sanket");
		 
		 System.out.println(sb1==sb2);
		 System.out.println(sb1.equals(sb2));
	}
}
