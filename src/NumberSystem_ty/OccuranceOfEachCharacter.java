package NumberSystem_ty;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
String s="testyantra";
LinkedHashSet<Character>set=new LinkedHashSet<Character>();
for (int i = 0; i <s.length(); i++) {
	set.add(s.charAt(i));
	
}
for(Character ch:set)//tesyanra
{ 
	int count=0;
	for (int j = 0; j < s.length(); j++)
	{
		if(ch==(s.charAt(j)))
		{
			count++;
		}
		
	}
	System.out.println(ch+" occur is in "+count+ " times");
	
}


	
}
	}


