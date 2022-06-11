package java8.pwing.ObjectClonning;

// Deep cloning

class Dept implements Cloneable{
	int dept_id;
	String dept_name;
	
	public Dept() {
		
	}
	public Dept(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}	

public class DeepCompany implements Cloneable{
	
	int id;
	float percentage;
	Dept dept;
	
	public DeepCompany() {
		
	}

	public DeepCompany(int id, float percentage, Dept dept) {
		super();
		this.id = id;
		this.percentage = percentage;
		this.dept = dept;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
				
		DeepCompany dummyComp = (DeepCompany) super.clone();
		dummyComp.dept = (Dept)dept.clone();
	
		return dummyComp;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Dept d1 = new Dept(1, "HR");
		DeepCompany s1 = new DeepCompany(10, 67.76f, d1);
		
		DeepCompany s2 = (DeepCompany)s1.clone();
		
		System.out.println("\ns1 id -----> "+s1.id);
		System.out.println("s1 department  ----> "+s1.dept.dept_name);

		s2.id = 30;
		s2.dept.dept_name = "Finance";
				
		System.out.println("\ns1 id -----> "+s1.id);
		System.out.println("s1 department  ----> "+s1.dept.dept_name);
	}
}




