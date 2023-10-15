package Practice;

public class FreuencyOf_specific_char {

	public static void main(String[] args) {
		String s="java and seleniam";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='j')
				count++;
		}
		System.out.println(count);

	}

}
