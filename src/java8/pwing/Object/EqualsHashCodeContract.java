package java8.pwing.Object;

public class EqualsHashCodeContract {

/*	hashCode() equals() contract :	- when two objects are equal by equals() method 
 										then hashCode of this two objects must be same
 									- when two objects are not equal  by equals() method
 										then hashCode of this two objects may be same or
 										may not be same
 									- when two objects are equal by hashCode() method then 
 										they are may or may not be same by equals()
 									- when two objects are not equal by equals() method then
 										are must not be same by equals()
	
 */	
	public static void main(String[] args) {
		
	//example <1> for equals() and hashCode() methods contract
		String s1 = "Aa";
		String s2 = "BB";
		
		System.out.println("\n"+s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("\n"+s1.equals(s2));
	
	//example <2> for equals() and hashCode() methods contract
		String s3 = "FB";
		String s4 = "Ea";
		
		System.out.println("\n"+s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println("\n"+s3.equals(s4));
	}
}
