package NumberSystem_ty;

import java.awt.SystemColor;

public class ReverseTheEachWord {

	public static void main(String[] args) {
 String s="Welcome to India";
String st = s.toLowerCase();
String[] s1 = st.split(" ");
for (int i=0;i<s1.length;i++) {

	{
		String s2 = s1[i];
		for (int j=s2.length()-1;j>=0;j--) {
			System.out.print(s2.charAt(j));
			
	
		
	}
		System.out.print(" ");
	
	}

	
}}}
