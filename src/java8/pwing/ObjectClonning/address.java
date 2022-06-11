package java8.pwing.ObjectClonning;

public class address implements Cloneable{
	
	int zip_code;
	String city;
	String landmark;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "address [zip_code : " + zip_code + ", city : " + city + ", landmark : " + landmark + "]";
	}

	public address() {
		
	}
	
	public address(int zip_code, String city, String landmark) {
		super();
		this.zip_code = zip_code;
		this.city = city;
		this.landmark = landmark;
	}
		
}
