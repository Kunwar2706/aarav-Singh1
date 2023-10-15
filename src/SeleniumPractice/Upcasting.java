package SeleniumPractice;

public class Upcasting {
void test()
{
	System.out.println("hi");
	
}
}
class B1 extends Upcasting
{
	void testA ()
	{
		System.out.println("bye");
	}
}
class c {
	public static void main(String[] args)
	{
Upcasting a =new B1();
a.test();

	}

}
