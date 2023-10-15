package collectionpractice;

import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class ArrayListEx1 {

	public static void main(String [] args)
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	System.out.println("array list data"+al);
	System.out.println("size of data  " +al.size());
	al.add(2,100);
	System.out.println("after adding a data"+al);
	al.remove(2);
	System.out.println("after removing "+al);
	System.out.println("aafter removing size"+al.size());
	System.out.println(al.indexOf(2));
	System.out.println(al.contains(2));
	System.out.println(al.get(3));
	ArrayList<Integer>a=new ArrayList<Integer>();
	a.add(500);
	a.add(600);
	System.out.println("eliment of al is "+al);
	System.out.println("eliment of a is "+a);
	a.addAll(2,al);
	System.out.println("after adding eliment of al to a"+a);
	
		

	}

}
