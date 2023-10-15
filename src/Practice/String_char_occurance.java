package Practice;

public class String_char_occurance {

	public static void main(String[] args) {
		String s="java is a good programing language";
		int count[]=new int[26];
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')  
			{
				count[ch-97]++;
			}
				if(ch>='A' && ch<='Z')
				{
					count[ch-65]++;
				}
			}
				for(int j=0;j<=count.length;j++)
				{
					if(count[j]!=0)
					
						System.out.println((char)(j+97)+" " +count[j]);
					
				}
			}

	}


