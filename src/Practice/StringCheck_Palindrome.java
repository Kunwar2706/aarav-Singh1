package Practice;

public class StringCheck_Palindrome {

	public static void main(String[] args) {
		String s="malyalam";
		boolean b = isPallindrome(s);
		if(b==true)
		{
			System.out.println("is a palindrome ");
		}
		else
		{
			System.out.println("given string not a palindrome");
		}

	} 	 

	public static boolean isPallindrome(String s){
		int i=0;
		int l = s.length()-1;
		char ch[]=s.toCharArray();
		while(i<l/2)
		{
			if(ch[i]!=ch[l])
			{
				return false;

			}
			i--;
			i++;
		}
		{
			return true;
		}
	}
}






