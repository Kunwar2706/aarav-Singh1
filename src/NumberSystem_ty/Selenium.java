package NumberSystem_ty;

public class Selenium {
//	s 
//	s e 
//	s e l 
//	s e l e 
//	s e l e n 
//	s e l e n e 
//	s e l e n e i 
//	s e l e n e i u 
//	s e l e n e i u m 
	public static void main(String[] args) {
String s="seleneium";
char[] ch = s.toCharArray();
int row=9;
int value=1;
for (int i = 1; i <=row; i++) 
{
	for (int j = 0; j <value; j++) 
	{
		System.out.print(s.charAt(j)+" ");
	}
	System.out.println();
	value++;
}
	}

}
