package exeptionhandling;

public class ExeceptionStringEx1 {

	public static void main(String[] args) {
String country=null;
try
{
	if(country.equals("india"))
	{
		System.out.println("independent nation declared in august");
	}
	else
	{
		System.out.println("invalid");
	}
}
catch(NullPointerException e)
{
	System.out.println(e);
}
System.out.println("complited");
	}

}
