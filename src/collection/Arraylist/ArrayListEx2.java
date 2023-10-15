package collection.Arraylist;
import java.util.*;
import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
	ArrayList<Employee>al=new ArrayList<Employee>();
	al.add(new Employee(111,"amit"));
	al.add(new Employee(222,"pradeep"));
	for(Employee e:al)
	{
		System.out.println(e.eid+"-->"+e.ename);
	}
	}

}
