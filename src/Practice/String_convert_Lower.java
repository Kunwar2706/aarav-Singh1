package Practice;

public class String_convert_Lower {

	public static void main(String[] args) {
		String s="I LOVE MY INDIA";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				ch[i]= ((char)(ch[i]+32));
			}
			
		}
		String str=new String(ch);
		System.out.println(str);
	}

}
