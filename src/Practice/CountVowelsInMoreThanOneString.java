package Practice;

import java.util.ArrayList;

public class CountVowelsInMoreThanOneString {

	public static void main(String[] args) {
String s1 = "jyotish is good";
String s2 = " pandey is nice humain being";
String s3 = "pankaj is good in concept";
String v="AEIOUaeiou";
ArrayList<String>al=new ArrayList<String>();
al.add(s1);
al.add(s2);
al.add(s3);
for(int i=0;i<al.size();i++)
{
	String fs = al.get(i);
	int count=0;
	
	for(int j=0;j<fs.length();j++)
	{
		char ch = fs.charAt(j);
		if(v.indexOf(ch)!=-1)
		{
			count ++;
		}
	}
	System.out.println("in string "+al.get(i)+" total no of vowels "+count++);
}
	}

}
