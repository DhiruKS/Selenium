package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cursor is an interface in java collection frameworks by which we can retrieve the object in the collection one by one
		/*
		 * Enumeration is an interface which extends Cursor .This will only applicable to old legacy class link vector and hashtable
		 * In enumeration there are only 2 methods 1.Public boolean hasMoreElements(); amd public E nextElement()
		 * Limitations 
		 * 1.its is single direction only we can move only in forward direction 
		 * 2.By enumeration we can only read the data we can not insert or delete the data ;
		 * 
		 */
		Vector<Integer>v=new Vector<Integer>();
		for (int i = 0; i < 10; i++) 
		{
			v.add(i);
			
		}
		System.out.println(v);
		//to use the enumeration for vector we have a method call elements()
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements())
		{
			//to store each elements of vector have to wapper class 
			Integer value=(Integer)e.nextElement();
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
	}
}
