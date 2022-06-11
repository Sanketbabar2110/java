package java8.pwing.Object;

/*clone() :		creates and returns copy of this object
				- implements Cloneable
				- throws CloneNotSupportedException
				- type Casting is required
		
		protected native Object clone() throws CloneNotSupportedException
		 
	There are two ways to clone the Object
		1. Shallow cloning
		2. Deep cloning
		
	NOTE : in cloning for primitives and immutable objects direct seprate memory is allocated 
			but for mutable objects we have to provide memory explicitly by creating deep copy.
*/

public class CloneMethod implements Cloneable {
	
	String name;
	int rollno;
	
	CloneMethod(String name, int rollno){
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneMethod c1 = new CloneMethod("Sanket", 10);
		CloneMethod c2 = (CloneMethod)c1.clone();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
}

	@Override
	public String toString() {
		return "[name : " + name + ", rollno : " + rollno + "]";
	}
	
}
