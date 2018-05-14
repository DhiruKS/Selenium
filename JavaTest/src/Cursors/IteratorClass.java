package Cursors;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If we want to retrieve objects one by one from the collection, then we should go for Iterator Interface 
		 * Iterator is applicable for every type of collection object hence also called universal iterator
		 * Iterator can perform both read and write operation 
		 * but its is also unidirectional 
		 */
		LinkedList<Integer>l=new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator<Integer>itr=l.iterator();//
		while(itr.hasNext())//Has Next () return type is boolean its will return true if next element will present
		{
			Integer value=(Integer)itr.next();//its will retrieve the next element return type is object class
			if(value%2!=0)
			{
				System.out.println(value);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(l);
		System.out.println(itr.hasNext());
	}

}
