package java8.pwing.ObjectClonning;

// Shallow Cloning

public class ShallowStudent implements Cloneable{
	
	int roll_num;
	String name;
	address add;
	
	public ShallowStudent() {
		
	}
	
	public ShallowStudent(int roll_num, String name, address add){
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.add = add;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		address a1 = new address(416110,"Kolhapur", "ShivajiPeth");
		ShallowStudent ss1 = new ShallowStudent(10, "Sanket", a1);
		ShallowStudent ss2 = (ShallowStudent)ss1.clone();
		
		System.out.println(ss1.add.city);
		System.out.println(ss1.add.landmark);
		
		ss2.add.city = "pune";
		ss2.add.landmark = "DangeChowk";
		
		System.out.println("\n"+ss1.add.city);
		System.out.println(ss1.add.landmark);
	}
}
