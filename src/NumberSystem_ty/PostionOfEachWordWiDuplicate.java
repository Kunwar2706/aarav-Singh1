package NumberSystem_ty;

public class PostionOfEachWordWiDuplicate {

	public static void main(String[] args) {
String s=" I am from from  champaran bihar";
String[] st = s.split(" ");
for (int i = 0; i < st.length; i++) 
{
	System.out.println(st[i]+" is in "+(i+1)+" postion");
}
	}

}
