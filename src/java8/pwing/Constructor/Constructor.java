package java8.pwing.Constructor;

public class Constructor {
	
	/**
	 * Constructor : 	-It is special type of method which has same name as class name
	 * 					-It has no return type
	 * 					-It is used to initialize instance fields of newly created object
	 * 					-It stored in method area and executes in stack area
	 * 					
	 * 					-"this."    ---> access current object
	 * 					-"this()"   ---> -access constructor in same class
	 * 									 -it is used to initialize fix value for one of the field
	 * 					-"super()"   ---> access constructor in parent class
	 * 	
	 *	There are three types of constructor :
	 *
	 *	Default constructor :	-the constructor which is called by JVM by default
	 *							-it is used to initialize instance fields of newly created object
	 *								with default values
	 *							-when we write any constructor default constructor is deleted 
	 *
	 *	Parameterized constructor :		-the constructor which has arguments 
	 *									-it is used to initialize instance field with actual values
	 *
	 *	No-arg constructor : 	-the constructor is written manually and same as default constructor
	 *							-it is must be written with parameterized constructor because default 
	 * 								constructor is deleted
	 * **/
	
	static String bank = "State Bank of India";
	static String add_bank = "Kasba pethVadgoan 416110";
	
	String user;
	String acc_type;
	int acc_number;
	String add_user;
	int  acc_balance;
	
	public Constructor() {
	}
	
	public Constructor(String user, String acc_type, int acc_number, String add_user, int acc_balance) {
		super();
		this.user = user;
		this.acc_type = acc_type;
		this.acc_number = acc_number;
		this.add_user = add_user;
		this.acc_balance = acc_balance;
	}
	
	public static void main(String[] args)
	{
		Constructor User1 = new Constructor("XYZ","Saving Account",123456789,"z galli khochi",20000);
		
		System.err.println(User1.info());
		System.out.println(User1.toString());
		
		Constructor User2 = new Constructor("ABC","Current Account",987654321,"x galli khochi",80000);
		
		System.err.println(User2.info());
		System.out.println(User2.toString());
	}
	
	public String info() {
		return "\nBank		: "+ bank +"\nBank Address	: "+ add_bank + "\n\nUser Details	: " ;
	}

	@Override
	public String toString() {
		return "\n\tuser		:  " + user + "\n\tAccount type	:  " + acc_type + "\n\tAccount number	:  " + acc_number +
				"\n\tUser Address	:  " + add_user + "\n\tAccount balance	:  " + acc_balance;
	}
}
