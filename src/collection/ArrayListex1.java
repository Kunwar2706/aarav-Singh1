package collection;

import java.util.ArrayList;

public class ArrayListex1 {
public static void main(String []arg)
{
	ArrayList<Object>al=new ArrayList<Object>();
	al.add(10);
	al.add("a");
	al.add("amit");
	al.add("anjali");
	al.add(10);
	al.add(null);
	System.out.println("array list data"+al);
	System.out.println("arraylistsixe-->"+al.size());
	al.add(1, "a1");
	System.out.println("after adding object arraylist size-->"+al.size());
	System.out.println("arraylistdata"+al);
	al.remove(1);
	al.remove("a");
	System.out.println("after removing arraylist size-->"+al.size());
	System.out.println("arraylist data"+al);
	System.out.println(al.isEmpty());
	al.clear();
	System.out.println(al.isEmpty());
	System.out.println("-------------");
	System.out.println("using for each loop");
	for(Object o:al)
	{
		System.out.println(o);
	}
	System.out.println("------------");
	System.out.println("using forloop ");
	for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
	}
	
}

