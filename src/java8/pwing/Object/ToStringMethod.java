package java8.pwing.Object;

/*	toString()	:	- Object class toString() method returns
 			
 		    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }				 		
*/
public class ToStringMethod {
	
	public static void main(String[] args) {
		
		ToStringMethod t1 = new ToStringMethod();
		System.out.println(t1.toString());
	}
}
