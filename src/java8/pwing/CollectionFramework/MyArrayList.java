package java8.pwing.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
	public static void main(String[] args) {
		
	/**
	 * 	>	In Arrays when we print array by using toString() method without adding any element 
	 *  	then default values are printed
	 *  
	 *  		like this
	 *  					[0, 0, 0, 0, 0]
	 *  					[null, null, null, null, null]
	 *  
	 **/  
		
		int[] x = new int[5];
		System.out.println(Arrays.toString(x));
		
		String[] s = new String[5];
		System.out.println(Arrays.toString(s));
		
	/**
	 * 	>	In ArrayList when we print instance of ArrayList then empty list is printed
	 * 		because toString() method of abstractCollection class is executed by default
	 *
	 *			like this 
	 *						[]
	 * **/
		
		ArrayList<Integer> list = new ArrayList<>(15);
		System.out.println("\n"+list);
	
	//	collection interface methods implementation in ArrayList class
		
	/**
	 * 	>	1. public boolean add(Element e)
	 * 
	 * 	>	Adds element in ArrayList
	 * 	>	always returns true value
	 * 
	 * **/
		
		System.out.println("\n"+list.add(10));
		System.out.println(list.add(20));
		System.out.println(list.add(30));
		
		System.out.println(list);
		
	/**
	 * 	>	2. public boolean addAll(Collection c)
	 * 
	 *  >	Appends all of the elements in the specified collection to the end of
     * 		this list
     * 	>	returns true if this list changed as a result of the method call
     * 	>	throws NullPointerException if the pecified collection is null
     * 
	 * **/
		
		System.out.println("\n"+list.addAll(list));
		
		System.out.println(list);
		
	/**
	 *	3.	public boolean remove(Object o)
	 *
	 *	>	Removes the first occurrence of the specified element from this list,
     * 		if it is present.
     * 	>	if the list doesn't contain element it is unchanged
     * 	>	if element is present into the list then returns true otherwise returns
     * 		false
	 * 
	 * **/
		
		System.out.println("\n"+list.remove((Integer)20));	
		
		//type casting is required because JVM considers 20 as int index but actually it is an Object 
		
		System.out.println(list);
		
	/**
	 *	4.	public boolean removeAll(Collection c)
	 *
	 *	>	Removes from this list all of its elements that are contained in the
     *		specified collection.
     *	>	returns true if this list changed as a result of the method call
     *	>	throws ClassCastException if the class of an element of this list
     *      is incompatible with the specified collection
     *	>	throws NullPointerException if this list contains a null element and the
     *      specified collection does not permit null elements
	 * 
	 * **/
		
		System.out.println("\n"+list.removeAll(list));
		
		System.out.println(list);
		
	/**
	 *	5.	public boolean contains(Object o)
	 *
	 *	>	returns true if list contains specified element 
	 * 
	 * **/
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("\n"+list.contains(20));
		System.out.println(list.contains(60));
		
		System.out.println(list);
		
	/**
	 *	6.	public boolean retainAll(Collection c)
	 *
	 *	>	Retains only the elements in this list that are contained in the
     *		specified collection.  In other words, removes from this list all
     *		of its elements that are not contained in the specified collection.
     *	>	returns true if this list changed as a result of the call
     *	>	throws ClassCastException if the class of an element of this list
     *      is incompatible with the specified collection
     *	>	NullPointerException if this list contains a null element and the
     *      specified collection does not permit null elements
     *      
	 * **/
		
		ArrayList<Integer> lis = new ArrayList<>();
		
		lis.add(20);
		lis.add(30);
		lis.add(40);
		
		System.out.println("\n"+list.retainAll(lis));
		
		System.out.println(list);
		
	/**
	 *	7.	public int size()
	 *
	 *	>	returns the number of elements in this list
	 *
	 * **/
		
		System.out.println("\nSize : "+list.size());
		
	/**
	 *	8.	public boolean isEmpty()
	 *
	 *	>	returns true if ArrayList is empty
	 * 
	 * **/
		
		System.out.println("\nisEmpty : "+list.isEmpty());
		
	/**
	 *	9.	public void clear()
	 *
	 *	>	removes all the elements in this list, the list will be empty
	 *		after this method call
	 * **/
		
		list.clear();
		lis.clear();
		
		System.out.println("\n"+list);
		System.out.println(lis);
		
	/**
	 *	10.	public Object[] toArray()
	 *
	 * 	>	returns an array containing all the elements in this List in 
	 * 		proper sequence
	 *	>	return type is Object[]
	 * 
	 * **/
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("\n"+Arrays.toString(list.toArray()));
		
	//	List interface methods implementation in ArrayList class
		
	/**
	 *	11.	public void add(int index, E element)
	 *
	 *	>	insert the specified element at specified position in this
	 *		List. Shifts the element currently at that position (if any) and
     * 		any subsequent elements to the right
     * 	>	throws IndexOutOfBoundException if specified index is out of range
	 * 
	 * **/
		
		list.add(2, 40);
		list.add(0, 50);
		
		System.out.println("\n"+list);
		
	/**
	 *	12. public boolean addAll(int index, Collection c)	
	 * 
	 *	>	Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right
     *	>	returns true if this list changed as a result of the call
     *	>	throws IndexOutOfBoundExeption if index is greater then size
     *		or -ve 
     *
	 * **/
		
		System.out.println("\n"+list.addAll(1, list));
		
		System.out.println(list);
		
	/**
	 *	13. public E remove(int index)
	 *
	 *	>	Removes the element at the specified position in this list.
     *		Shifts any subsequent elements to the left
     * 	>	returns the element that was removed from the list 
	 * 
	 * **/
		
		System.out.println("\n"+list.remove(0));
		System.out.println(list.remove(2));
		
		System.out.println(list);
		
	/**
	 *	14.	public E get(int index)
	 *
	 *	>	returns the element at the specified position in the List
	 *	>	throws IndexOutOfBoundExeption if specified index is out of range
	 * 
	 * **/
		
		System.out.println("\n"+list.get(0));
		System.out.println(list.get(5));
		//System.out.println(list.get(10));	//IndexOutOfBoundExeption
		
		System.out.println(list);
		
	/**
	 *	15.	public E set(int index, E element)
	 *
	 * 	>	replaces element at specified position with specified element
	 * 	>	And returns old element at specified position 
	 * 
	 * **/
		
		System.out.println("\n"+list.set(0, 10));
		System.out.println(list.set(2, 30));
		
		System.out.println(list);
		
	/**
	 *	16.	public int indexOf(Object o)
	 *
	 *	>	Returns index of first occurrence of specified element 
	 *		in this list, or -1 if this list does not contain the element.
	 * 
	 * **/
		
		System.out.println("\n"+list.indexOf(20));
		System.out.println(list.indexOf(40));
		
	/**
	 *	17.	public int lastIndexOf(Object O)
	 *
	 *	>	returns the index of the last occurrence of the specified element
     *		in this list, or -1 if this list does not contain the element.
	 * 
	 * **/
		
		System.out.println("\n"+list.lastIndexOf(10));
		System.out.println(list.lastIndexOf(30));
		
	//ArrayLIst specific methods
		
	/**
	 *	18.	public void trimToSize()
	 *
	 *	>	Trims the capacity of this ArrayList instance to be the
     * 		list's current size.  
     *	>	An application can use this operation to minimize
     * 		the storage of an ArrayList instance.
	 * 
	 * **/
		
		list.trimToSize();
		System.out.println("\nSize --> "+list.size());
		
	/**
	 *	19.	public void ensureCapacity(int minCapacity)
	 *
	 *	>	Increases the capacity of this ArrayList instance, to the 
	 *		specified minimum capacity argument.
	 *	>	to ensure that it can hold at least the number of elements
     * 
	 * **/
		
		list.ensureCapacity(10);
		
	}
}
