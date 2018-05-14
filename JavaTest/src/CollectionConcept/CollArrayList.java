package CollectionConcept;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollArrayList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Dhiraj");
		System.out.println(al);
		al.add("Is");
		al.add(1, "Singh");
		System.out.println(al);
		System.out.println(al.size());
		//al.set(3, "learning");//its will throw run time exception java.lang.IndexOutOfBoundsException
		System.out.println(al.set(2, "What"));
		//
		System.out.println(al);
		System.out.println(al.isEmpty());//return type is boolean 
		al.remove(2);
		al.remove("Dhiraj");
		System.out.println(al);
		String str=al.toString();
		System.out.println(str);
		
		LinkedList<String> Ll=new LinkedList<String>();
		Ll.add("Dhiraj");
		Ll.addAll(al);
		System.out.println(Ll);
		
		

	}

}
