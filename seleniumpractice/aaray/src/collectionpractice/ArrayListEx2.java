package collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args)
	{
		
    ArrayList<String> al=new ArrayList<String>();
	al.add("copy");
	al.add("pen");
	al.add("pencil");
	System.out.println("array data"+al);
	System.out.println("using for iterator");
	Iterator<String>it=al.iterator();
	while(it.hasNext());
	{
	String str	=it.next();
	if(str=="pen")
	{
		it.remove();
		System.out.println(al);
	}
	}
	
	
	
	
	

	}

}
