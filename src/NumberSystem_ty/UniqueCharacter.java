package NumberSystem_ty;

import java.util.LinkedHashSet;

public class UniqueCharacter {

	public static void main(String[] args) {
		String s=" TestYantra";
		String st = s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) 
		{
			set.add(st.charAt(i));
		}
		for(Character ch:set)//tesyanr
		{
	
				
			System.out.print(ch);
			
		}

	}

}
