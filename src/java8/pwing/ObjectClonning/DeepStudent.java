package java8.pwing.ObjectClonning;

// Deep cloning

public class DeepStudent implements Cloneable {
	
	int roll_num;
	String name;
	address add;
	
	public DeepStudent() {
		
	}
	
	public DeepStudent(int roll_num, String name, address add) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.add = add;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		
		DeepStudent dummyStudent = (DeepStudent)super.clone();
		dummyStudent.add = (address)add.clone();
		return dummyStudent;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		address a1 = new address(416110, "PethVadgoan", "Ganesh Mandir");
		DeepStudent s1 = new DeepStudent(10, "Sanket", a1);
		
		DeepStudent s2 = (DeepStudent)s1.clone();
		
		System.out.println(s1.add.city);
		System.out.println(s1.add.landmark);
		
		s2.add.city = "Kolhapur";
		s2.add.landmark = "ShivajiPeth";
		
		System.out.println("\n"+s1.add.city);
		System.out.println(s1.add.landmark);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

	@Override
	public String toString() {
		return "Student [roll_num : " + roll_num + ", name : " + name + ", add : " + add + "]";
	}
	
}
