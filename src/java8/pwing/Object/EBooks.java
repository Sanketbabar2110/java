package java8.pwing.Object;

/*	Overriding equals() : for content comparison 
			   hashCode() : because of contract
			   toString() : to convert object in to String representation
*/

import java.util.Objects;
import java.util.Scanner;
public class EBooks {
	
	int price;
	String book;
	String author;
	
	public EBooks(int price,String book, String author)
	{
		this.price = price;
		this.book = book;
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, book, price);
	}
	
	@Override
	public boolean equals(Object obj2) {
		if (this == obj2)		//this b1    &&&	obj2 b2
			return true;
		if (obj2 == null)
			return false;
		if (getClass() != obj2.getClass())
			return false;
		//Equals other = (Equals) obj;	//Down Casting
		EBooks other = (EBooks)obj2;
		return  Objects.equals(book, other.book) && price == other.price;
	}
	
	@Override
	public String toString() {
		return "[price=" + price + ", book=" + book + ", author=" + author + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);

			System.out.println("\nEnter price, Book name and author : ");
			EBooks b1 = new EBooks(sc.nextInt(), sc.next(), sc.next());
			System.out.println(b1.toString());
			
			System.out.println("\nEnter price, Book name and author : ");
			EBooks b2 = new EBooks(sc.nextInt(), sc.next(), sc.next());
			System.out.println(b2.toString());
			
			System.out.println("\nEnter price, Book name and author : ");
			EBooks b3 = new EBooks(sc.nextInt(), sc.next(), sc.next());
			System.out.println(b3.toString());
	
		System.out.println("\nReferance equality of object : "+(b1==b2));
		System.out.println("Content equality of object : "+b1.equals(b2));
		
		System.out.println("\nReferance equality of object : "+(b1==b3));
		System.out.println("Content equality of object : "+b1.equals(b3));
		
		System.out.println("\nReferance equality of object : "+(b2==b3));
		System.out.println("Content equality of object : "+b2.equals(b3));
		
		sc.close();
	}

	

}
