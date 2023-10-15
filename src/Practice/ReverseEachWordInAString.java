package Practice;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String str="Amit singh ";//original string
		String[] words = str.split(" ");//splitting the word 
		String reverseString="";
		for(String w:words)//welcome
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString =reverseString+reverseword+"";
		}
		System.out.println(reverseString);
	}

}
