package NumberSystem_ty;

import java.util.LinkedHashSet;

public class countDuplicateCharacter {

	public static void main(String[] args) {
		String s="Testyantra";
		String st = s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) 
		
		{
			set.add(st.charAt(i));
		}
	for(Character ch:set)//
	  {      int count=0;
		for (int i = 0; i <st.length(); i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}

		}
		if(count>1)
		{
			System.out.println(ch+"repeat is in "+count+" times");
		}
	}
	

	}

}
