package collection;

import java.util.TreeMap;

import amit.Student;

public class HashStudent{

	public static void main(String[] args)
	{
	TreeMap<Integer,Object> hm=new TreeMap <Integer,Object>();
	hm.put(28,new Student(899,"pooja"));
	hm.put(25,new Student(109,"peter"));
	hm.put(1,new Student(130,"ajay"));
	hm.put(5, new Student(899,"priya"));
	System.out.println(hm.entrySet());
	System.out.println("only keys" +hm.keySet());
	System.out.println("only values" +hm.values());

	
	}

}
