package CollectionConcept;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collection or container is use to hold the the object or element of different type
		//to transfer an obj across the network the object must implements serialiable interface
		/*
		 * usally we can use collection to hold and tranfer obj to 1 location to another location (container )
		 * to provude suppourt for these every collection class implemnets serialable and cloneable interface 
		 * array list and vector class implements RandomAccess(I) so that any random elemnet we can acces with some speed
		 * if our frequent operation is retrieveal we should go for array list 
		 * Random Access Interface present in java .util package and it doesnot ontain any method 
		 * it is a marker interface ,where required ability will be provided automatically by the JVM
		 * 
		 */
		ArrayList l=new ArrayList();
		LinkedList l2=new LinkedList();
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Serializable);
		
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof RandomAccess);
		System.out.println(l2 instanceof Serializable);
		/*
		 * If our frequent operation is addition or removable then we should go fofor 
		 * Linked list 
		 * difference btw array list and verctor 
		 * Al is non synchronized every method present in vector is synchronized 
		 * at a time multiplr threads are allowed to operate AL obj and hence its not thread sagr
		 * vector is thread safe at a time only one thread is allow to oprerate 
		 * Relatively Pm is high because threads are not reqired to wait to operate on al obj 
		 * 
		 * Relatively Pm is low because threads are  required to wait to operate on vector obj 
		 * vector is legacy class
		 * how to get synchronized version of Al obj 
		 */
		ArrayList al=new ArrayList();
		List l1=(List) Collections.synchronizedList(al);
		
	}

}
