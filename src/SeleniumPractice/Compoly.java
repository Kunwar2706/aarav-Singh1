package SeleniumPractice;

public class Compoly
{
void testA()
{
	System.out.println("hi");
}
void testA( int i)
{
	System.out.println("i");
}
class B{
	public static void main(String[] args)
	{
		Compoly c=new Compoly();
		c.testA();
	}
		
	}

}
