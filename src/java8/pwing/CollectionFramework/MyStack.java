package java8.pwing.CollectionFramework;

public class MyStack {
	public static void main(String[] args) {
		
		// Vector class methods by default available to the Stack class
		
		//Stack class specific methods
		
		/**
		 *	>	1. public E push(E item)
		 *
		 *	>	Pushes an item onto the top of this stack.
		 *	>	returns the item argument.
		 * 
		 * **/
		
		/**
		 * 	>	2.	public synchronized E pop()
		 * 
		 * 	>	Removes the object at the top of this stack and returns that
		 * 		object as the value of this function.
		 * 	>	return The object at the top of this stack (the last item
		 *		of the Vector object).
		 *	>	throws EmptyStackException if this stack is empty
		 * 
		 * **/
		
		/**
		 * 	>	3. public synchronized E peek()
		 * 
		 * 	>	Looks at the object at the top of this stack without removing it
		 * 		from the stack.
		 * 	>	throws EmptyStackException if this stack is empty.
		 * 
		 * **/
		
		/**
		 * 	>	4. public boolean empty()
		 * 
		 * >	return true if and only if this stack contains no items; false otherwise.
		 * 
		 * **/
		
		/**
		 * 	>	5. public synchronized int search(Object o)
		 * 
		 * 	>	If the object o occurs as an item in this stack, this method returns
		 *  	the distance from the top of the stack; the topmost item on the stack
		 *  	is considered to be at distance 1. The .equals method is used to 
		 *  	compare o to the items in this stack.
		 * 
		 * **/
	}
}
