package Practice;

public class ReveseStringUsingConcat {

	public static void main(String[] args) {
		//using string concatenation operator
		String str="ABCD";
		String rev="";
		/*int length=str.length();//4
		for(int i=length-1;i>=0;i--)//3,2,1,0,-1
		{
			rev=rev+str.charAt(i);//DBCA
		}
		System.out.println("revese string is:"+ rev);*/
		
		//2.USING CHARACTER ARRAY
		/*char a[]=str.toCharArray();
		int len=a.length;//4
		for(int i=len-1;i>=0;i--)//3 2 1 0 -1
		{
			rev=rev+a[i];//DCBA
		}
		System.out.println("revese a string:" +rev);*/
		 
		
		//using String Buffer class
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());

	}
}

