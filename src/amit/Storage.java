package amit;

import java.util.ArrayList;

public class Storage{
	public static void main(String[]aa) {
		ArrayList<Object>ob=new ArrayList<Object>();
		ob.add(new Student ("dinesh",101));
		ob.add(new Student ("amit" ,201));
		ob.add(new Employee("ravi",301,5000.55));
		for(Object i:ob)
		{
		System.out.println(i);
		}
		
	}

}
