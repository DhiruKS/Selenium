package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorClass {

	private static final Integer Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		//The Integer class wraps a value of the primitive type int in an object. 
		//An object of type Integer contains a single field whose type is int. 
		for (int i = 0; i < 10; i++) 
		{
			al.add(i);
			
		}
		System.out.println(al);
		//to retrieve the data from array list we have to use list iterator
		ListIterator<Integer> itr=al.listIterator();
		while(itr.hasNext())
		{
			Integer value=(Integer)itr.next();
			if(value%2!=0)
			{
				System.out.println(value);
			}
			else
			{
				itr.remove();
			}
			
		}
		System.out.println(al);
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());

		itr.set(10);
		System.out.println(al);
	}

}
/*
 * Vector is synchronized 
 * Performance is low 
 * underlying data structure is resize arry null inseration is possib;e 
 * thread safe because each class in vector is synchronized
 * 
 * 
 * 
 * Difference bte array list and linked list 
 * ArrayList
 * null insertion is possibel
 * Al is best choise if our frequent operation is retrieve operation 
 * implements random access interface 
 * frequent operation is revtrivale opertaion 
 * in Al the elements will be stored in consicutive memory location and hence rtrievel operation will 
 * become easy 
 * 
 * Linked list
 * null insertion is possibel
 * frequent operation insertion or deletion in middle
 * in ll the elements won't be stored in consitive memory lovcation 
 * hence the retrival operation become complex
*/