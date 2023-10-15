package amit;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
	public static void main(String[]aa) {
		HashSet<Integer>h= new HashSet<Integer>();
		h.add(100);
		h.add(200);
		h.add(300);
		System.out.println("printing the element");
		System.out.println("for each loop");

		for(Integer i:h)
		{
			System.out.println(i);
		}
		Iterator<Integer>ob=h.iterator();
		
		System.out.println("printing the element using iterator");
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
	}

}
