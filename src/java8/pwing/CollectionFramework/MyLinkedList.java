package java8.pwing.CollectionFramework;

public class MyLinkedList {
	public static void main(String[] args) {
	
		//collection interface methods implementation in linked list class
		
		/**
		 *	>	1. public boolean add(Element e)
		 *
		 *	>	Appends the specified element at the end of this list
		 *	>	always returns true
		 *	
		 * **/
		
		/**
		 *	>	2. public boolean addAll(Collection c)
		 *
		 *	>	Appends all the elements in specified collection to the end of this list
		 *	>	returns true if this list changed as a result of call
		 *	>	throws NullPointerException if the specified collection is null
		 *
		 * **/
		
		/**
		 *	>	3. public boolean remove(Object o)
		 *
		 *	>	Removes the first occurrence of the specified element from this list,
		 * 		if it is present.  If this list does not contain the element, it is
		 *		unchanged.
		 *	>	return true if this list contained the specified element
		 *
		 * **/
		
		/**
		 *	>	4. public void clear()
		 *
		 *	>	Removes all of the elements from this list.
		 *	>	The list will be empty after this call returns.
		 *
		 * **/
		
		/**
		 *	>	5. public boolean contains(Object o)
		 * 
		 * 	>	 Returns true if this list contains the specified element.
		 * 
		 * **/
		
		/**
		 *	>	6. public int size()
		 *
		 *	>	Returns the number of elements in this list.
		 *
		 * **/
		
		/**
		 *	>	7. public Object[] toArray()
		 *
		 *	>	Returns an array containing all of the elements in this list
		 * 		in proper sequence (from first to last element).
		 * 	>	This method acts as bridge between array-based and collection-based
		 * 		APIs.
		 * 
		 * **/
		
		//		List interface methods implementation in ArrayList class
		
		/**
		 *	>	1. public void add(int index, E element)
		 *
		 *	>	Inserts the specified element at the specified position in this list.
		 * 		Shifts the element currently at that position (if any) and any
		 * 		subsequent elements to the right
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 *	>	2. public boolean addAll(int index, Collection c)
		 *
		 *	>	Inserts all of the elements in the specified collection into this
		 * 		list, starting at the specified position.  Shifts the element
		 * 		currently at that position (if any) and any subsequent elements to
		 * 		the right
		 *	>	returns true if this list changed as a result of the call
		 *	>	throws IndexOutOfBoundsException {@inheritDoc}
		 * 	>	throws NullPointerException if the specified collection is null
		 * 
		 * **/
		
		/**
		 *	>	3.	public E remove(int index)
		 *
		 *	>	Removes the element at the specified position in this list.  Shifts any
		 * 		subsequent elements to the left (subtracts one from their indices).
		 * 	>	Returns the element that was removed from the list.
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 *	>	4. public E get(int index)
		 *
		 *	>	Returns the element at the specified position in this list.
		 *	>	throws IndexOutOfBoundsException
		 *
		 ***/
		
		/**
		 * 	>	5. public E set(int index, E element)
		 * 
		 * 	>	Replaces the element at the specified position in this list with the
		 * 		specified element.
		 * 	>	return the element previously at the specified position
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 * 	>	6.  public int indexOf(Object o)
		 * 
		 * 	>	Returns the index of the first occurrence of the specified element
		 * 		in this list, or -1 if this list does not contain the element.
		 * 
		 * **/
		
		/**
		 * 	>	7. public int lastIndexOf(Object o)
		 * 
		 * 	>	Returns the index of the last occurrence of the specified element
		 * 		in this list, or -1 if this list does not contain the element.
		 * 
		 * **/
		
		// LinckedList class methods
		
		/**
		 * 	>	1. public E getFirst()
		 * 
		 * 	>	return the first element in this list
		 * 	>	throws NoSuchElementException if this list is empty
		 * 
		 * **/
		
		/**
		 * 	>	2. public E getLast()
		 * 
		 * 	>	return the last element in this list
		 * 	>	throws NoSuchElementException if this list is empty
		 * 
		 * **/
		
		/**
		 * 	>	3. public E removeFirst()
		 * 
		 * 	>	return the first element from this list
		 * 	>	throws NoSuchElementException if this list is empty
		 * 
		 * **/
		
		/**
		 * 	>	4. public E removeLast()
		 * 
		 * 	>	return the last element from this list
		 * 	>	throws NoSuchElementException if this list is empty
		 * 
		 * **/
		
		/**
		 * 	>	5.  public void addFirst(E e)
		 * 
		 * 	>	Inserts the specified element at the beginning of this list.
		 * 
		 * **/
		
		/**
		 * 	>	6. public void addLast(E e)
		 * 
		 * 	>	Appends the specified element to the end of this list.
		 * 
		 * **/
	}

}
