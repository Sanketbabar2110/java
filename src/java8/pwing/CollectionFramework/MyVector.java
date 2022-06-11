package java8.pwing.CollectionFramework;

public class MyVector {
	public static void main(String[] args) {
		
		// Collection interface methods implementation in vector

		/**
		 *	>	1. public synchronized boolean add(Element e)
		 *
		 *	>	Appends the specified element at the end of this Vector
		 *	>	always returns true
		 *	
		 * **/
		
		/**
		 *	>	2. public synchronized boolean addAll(Collection c)
		 *
		 *	>	Appends all the elements in specified collection to the end of this Vector
		 *	>	returns true if this Vector changed as a result of call
		 *	>	throws NullPointerException if the specified collection is null
		 *
		 * **/
		
		/**
		 *	>	3. public boolean remove(Object o)
		 *
		 *	>	Removes the first occurrence of the specified element from this Vector,
		 * 		if it is present.  If this Vector does not contain the element, it is
		 *		unchanged.
		 *	>	return true if this Vector contained the specified element
		 *
		 * **/
		
		/**
		 * 	>	4. public synchronized boolean removeAll(Collection c)
		 * 
		 * 	>	Removes from this Vector all of its elements that are contained in the
		 * 		specified Collection.
		 * 	>	return true if this Vector changed as a result of the call
		 * 	>	throws ClassCastException if the types of one or more elements
		 *      in this vector are incompatible with the specified
		 *      collection
		 *	>	NullPointerException if this vector contains one or more null
		 *     	elements and the specified collection does not support null
		 *     	elements or if the specified collection is null
		 * 
		 * **/
		
		/**
		 *	>	5. public boolean contains(Object o)
		 * 
		 * 	>	 Returns true if this Vector contains the specified element.
		 * 
		 * **/
		
		/**
		 * 	>	6. public synchronized boolean containsAll(Collection c)
		 * 
		 * 	>	Returns true if this Vector contains all of the elements in the
		 * 		specified Collection.
		 * 	>	throws NullPointerException if the specified collection is null
		 * 
		 * **/
		
		/**
		 * 	>	7. public synchronized boolean retainAll(Collection c)
		 * 
		 * 	>	Removes all elements from this Vector that are not contained in the specified 
		 * 		Collection.
		 * 	>	return true if this Vector changed as a result of the call
		 * 	>	ClassCastException if the types of one or more elements
		 *		in this vector are incompatible with the specified
		 *		collection
		 *	>	throws NullPointerException if this vector contains one or more null
		 *		elements and the specified collection does not support null
		 *		elements or if the specified collection is null
		 *
		 * **/
		
		/**
		 *	>	8. public void clear()
		 *
		 *	>	Removes all of the elements from this Vector.
		 *	>	The Vector will be empty after this call returns.
		 *
		 * **/
			
		/**
		 *	>	9. public int size()
		 *
		 *	>	Returns the number of elements in this Vector.
		 *
		 * **/
		
		/**
		 * 	>	10. public synchronized boolean isEmpty()
		 * 
		 * 	>	return true if and only if this vector has no components,
		 *		that is, its size is zero; otherwise returns false.      
		 * 
		 * **/
		
		/**
		 *	>	11. public Object[] toArray()
		 *
		 *	>	Returns an array containing all of the elements in this vector
		 * 		in proper sequence (from first to last element).
		 * 
		 * **/
		
		//		List interface methods implementation in ArrayList class
		
		/**
		 *	>	1. public void add(int index, E element)
		 *
		 *	>	Inserts the specified element at the specified position in this Vector.
		 * 		Shifts the element currently at that position (if any) and any
		 * 		subsequent elements to the right
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 *	>	2. public boolean addAll(int index, Collection c)
		 *
		 *	>	Inserts all of the elements in the specified collection into this
		 * 		Vector, starting at the specified position.  Shifts the element
		 * 		currently at that position (if any) and any subsequent elements to
		 * 		the right
		 *	>	returns true if this Vector changed as a result of the call
		 *	>	throws IndexOutOfBoundsException
		 * 	>	throws NullPointerException if the specified collection is null
		 * 
		 * **/
		
		/**
		 *	>	3.	public E remove(int index)
		 *
		 *	>	Removes the element at the specified position in this Vector. Shifts any
		 * 		subsequent elements to the left (subtracts one from their indices).
		 * 	>	Returns the element that was removed from the Vector.
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 *	>	4. public E get(int index)
		 *
		 *	>	Returns the element at the specified position in this Vector.
		 *	>	throws IndexOutOfBoundsException
		 *
		 ***/
		
		/**
		 * 	>	5. public E set(int index, E element)
		 * 
		 * 	>	Replaces the element at the specified position in this Vector with the
		 * 		specified element.
		 * 	>	return the element previously at the specified position
		 * 	>	throws IndexOutOfBoundsException
		 * 
		 * **/
		
		/**
		 * 	>	6.  public int indexOf(Object o)
		 * 
		 * 	>	Returns the index of the first occurrence of the specified element
		 * 		in this Vector, or -1 if this Vector does not contain the element.
		 * 
		 * **/
		
		/**
		 * 	>	7. public int lastIndexOf(Object o)
		 * 
		 * 	>	Returns the index of the last occurrence of the specified element
		 * 		in this Vector, or -1 if this Vector does not contain the element.
		 * 
		 * **/
		
		//Vector specific methods
		
		/**
		 *	>	1. public synchronized void addElement(E obj)
		 *
		 *	>	Adds the specified component to the end of this vector,
		 * 		increasing its size by one. The capacity of this vector is
		 * 		increased if its size becomes greater than its capacity.
		 * 
		 * **/
		
		/**
		 * 	>	2. public synchronized boolean removeElement(Object obj)
		 * 
		 * 	>	Removes the first occurrence of the argument from this vector, If the 
		 * 		object is Present in this vector, Shifts any subsequent elements to the
		 * 		left
		 * 	>	return true if the argument was a component of this vector otherwise, 
		 * 		returns false.
		 * 
		 * **/
		
		/**
		 * 	>	3. public synchronized void removeElementAt(int index)
		 * 
		 * 	>	Deletes the component at the specified index.Shifts any subsequent 
		 * 		elements to the left
		 * 	>	throws ArrayIndexOutOfBoundsException if the index is out of range
		 * 
		 * **/
		
		/**
		 * 	>	4.	public synchronized void removeAllElements()
		 * 
		 * 	>	Removes all components from this vector and sets its size to zero.
		 * 
		 * **/
		
		/**
		 * 	>	5.	public synchronized E firstElement()
		 * 
		 * 	>	returns the first component of this vector
		 * 	>	throws NoSuchElementException if this vector has no components
		 * 
		 * **/
		
		/**
		 * 	>	6.	public synchronized E lastElement()
		 * 
		 * 	>	Returns the last component of the vector.
		 * 	>	throws NoSuchElementException if this vector is empty
		 * 
		 * **/
		
		/**
		 * 	>	7.	public synchronized E elementAt(int index)
		 * 
		 * 	>	Returns the component at the specified index.
		 * 	>	throws ArrayIndexOutOfBoundsException if the index is out of range
		 * 
		 * **/
		
		/**
		 * 	>	8. public synchronized void setElementAt(E obj, int index)
		 * 
		 * 	>	Sets the component at the specified index of this vector to be the 
		 * 		specified object. The previous component at that position is discarded.
		 * 	>	throws ArrayIndexOutOfBoundsException if the index is out of range
		 * 
		 * **/
		
		/**
		 * 	>	9. public synchronized void insertElementAt(E obj, int index)
		 * 
		 * 	>	Inserts the specified object as a component in this vector at the
		 * 		specified index. Each component in this vector with an index greater
		 * 		or equal to the specified index is shifted to the right.
		 * 	>	throws ArrayIndexOutOfBoundsException if the index is out of range
		 * 
		 * **/
		
		/**
		 * 	>	10. public synchronized void setSize(int newSize)
		 * 
		 * 	>	Sets the size of this vector. If the new size is greater than the
		 * 		current size, new null items are added to the end of the vector. 
		 * 		If the new size is less than the current size, all components at 
		 * 		index newSize and greater are discarded.
		 * 	>	throws ArrayIndexOutOfBoundsException if the new size is negative
		 * 
		 * **/
		
		/**
		 * 	>	11. public synchronized int capacity()
		 * 
		 * 	>	Returns the current capacity of this vector. (the length of its internal
		 *      data array)
		 * 
		 * **/
	}

}
