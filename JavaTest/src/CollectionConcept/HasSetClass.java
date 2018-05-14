package CollectionConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HasSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//under laying data structure is hash table duplicates obj are not allowed 
		//insertion order is not preserved and its is based on hash code of obj 
		//null insertion is possible only single time heterogeneous obj are allowed 
		//implements serializable ,clonable but not random access interface 
		//best choice for search operation 
		//if we try to add dupicatde value then it will return false 
		//after new HashSet() this constructor creates an empty hashset obj with default capacity 16 and default fill rato  0.75
		//new HashSet(int initial capacity)
		//new HashSet(int initial capacity,float fill ratio) 
		//new HashSet(Collection C)meant for interconversion
		//fill ratio/load factor after filling how much ratio a new hashset obj will be created this is called fill ratio or load factor
		HashSet<String> h=new HashSet<String>();
		h.add("B");
		h.add("A");
		h.add("d");
		h.add("z");
		h.add("null");
		h.add("10");
		System.out.println(h.add("z"));
		System.out.println(h);
		/*
		 * Underlying data structure for linkedHashSet is linked list and hash tabbkle
		 * its is child class of hash set its ecectly same as hash set (including constructor and method 
		 * Except the following difference 
		 * insertion order is preserved 
		 */
		LinkedHashSet<Comparable> l=new LinkedHashSet<Comparable>();
		l.add("B");
		l.add("c");
		l.add("d");
		l.add("z");
		l.add("null");
		l.add(10);
		System.out.println(l.add("z"));
		System.out.println(l);
		/*
		 * in cache memory duplicates are not allowed 
		 * insertion order must be preserved 
		 * in general we can used linked hash set to develop cached based applications where duplicates are not allowed 
		 * 
		 * Sorted Set
		 * is child interface of set if we want to represent a group of individual obje accordinf to some sorting order without dupicates 
		 * to call first element we have first() for last(),headset()before an element 
		 * tailSet()after greater and equal to thet element 
		 * subSet(101,105)greater and less than 105
		 * comparator () retrun obj if we want to know under lying
		 */
		
	}

}
